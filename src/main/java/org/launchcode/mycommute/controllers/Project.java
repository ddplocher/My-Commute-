package org.launchcode.mycommute.controllers;

import org.launchcode.mycommute.models.data.TripRepository;
import org.launchcode.mycommute.models.data.UserRepository;
import org.launchcode.mycommute.models.forms.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("project")
public class Project {

    @Autowired
    private TripRepository tripRepository;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "")
    public String project(Model model) {
        Iterable <Trip> trips = tripRepository.findAll();


        model.addAttribute("trips", tripRepository.findAll());


        return "project/index";

    }
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddTripForm(Model model) {

        model.addAttribute(new Trip());
        model.addAttribute("trips", tripRepository.findAll());

        return "project/add";

    }


    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String add(@ModelAttribute @Valid Trip newTrip, Errors errors,
                      Model model) {
        if(errors.hasErrors()){
        return "project/add";

        }
            tripRepository.save(newTrip);


        return "redirect:/project";
}}
