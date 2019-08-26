package org.launchcode.mycommute.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

@RequestMapping(value= "")

    public String index() {
        return "index";

    }
    @RequestMapping(value ="login", method= RequestMethod.GET)
    public String login(Model model) {
    return "login";


    }

}
