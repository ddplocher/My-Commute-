package org.launchcode.mycommute.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;

@Controller
public class Project {

    @RequestMapping(value= "project")

    public String project() {
        return "project";

    }
}
