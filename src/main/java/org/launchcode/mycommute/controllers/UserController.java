package org.launchcode.mycommute.controllers;

import org.launchcode.mycommute.models.User;
import org.launchcode.mycommute.models.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("register")
public class UserController {


    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserRepository userRepository;

    @RequestMapping (value = "add", method = RequestMethod.GET)
    public String displayRegisterForm(Model model) {
        model.addAttribute("title", "Register");
        model.addAttribute(new User());

        model.addAttribute("users", userRepository.findAll());
        return "register/add";

    }

    @RequestMapping(value ="add", method = RequestMethod.POST)
    public String add(@ModelAttribute @Valid User user, Errors errors, Model model){

        if (errors.hasErrors()){
            model.addAttribute("title", "Register");
            return "register/add";
        }
        model.addAttribute("Title", "Register");



        String pw = user.getPassword();
        String encrytPw= passwordEncoder.encode(pw);
        user.setPassword(encrytPw);

        userRepository.save(user);

        return "redirect:/";
    }


}


