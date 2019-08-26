package org.launchcode.mycommute.controllers;

import org.launchcode.mycommute.models.data.TripDao;
import org.launchcode.mycommute.models.data.UserDao;
import org.launchcode.mycommute.models.forms.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("project")
public class Project {

    @Autowired
    private TripDao tripDao;

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "")
    public String project(Model model) {
        Iterable <Trip> trips = tripDao.findAll();



        model.addAttribute("trips", tripDao.findAll());


        return "project/index";

    }
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddTripForm(Model model) {

        model.addAttribute(new Trip());
        model.addAttribute("trips", tripDao.findAll());

        return "project/add";

    }


    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String add(@ModelAttribute Trip trip,
                      Model model) {


            tripDao.save(trip);


        return "redirect:/project";
}}
