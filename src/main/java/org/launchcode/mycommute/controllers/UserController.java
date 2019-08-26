package org.launchcode.mycommute.controllers;

import org.launchcode.mycommute.models.User;
import org.launchcode.mycommute.models.data.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("register")
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping (value = "", method = RequestMethod.GET)
    public String displayRegisterForm(Model model) {
        model.addAttribute("title", "Register");
        model.addAttribute(new User());
        model.addAttribute("users", userDao.findAll());
        return "/register";

    }

    @RequestMapping(value ="", method = RequestMethod.POST)
    public String add(@ModelAttribute @Valid User user, Model model){
        model.addAttribute("Title", "Register");
        userDao.save(user);

        return "redirect:/login";
    }

    @RequestMapping(value="login", method = RequestMethod.POST)
    public String login(@ModelAttribute @Valid User user, Model model){
        model.addAttribute("Title", "Login");
        return "login";
    }
}
