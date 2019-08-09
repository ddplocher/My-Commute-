package org.launchcode.mycommute.controllers;

import org.launchcode.mycommute.models.forms.Trip;
import org.launchcode.mycommute.models.data.TripDao;
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
    private TripDao tripDao;

    @RequestMapping(value = "")
    public String project(Model model) {


        model.addAttribute("title", "My Trips");
        model.addAttribute("trips", tripDao.findAll());

        return "project/index";

    }
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddTripForm(Model model) {
        model.addAttribute("title", "Add Trip");
        model.addAttribute(new Trip());
        model.addAttribute("trips", tripDao.findAll());
        return "project/add";

    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String add(@ModelAttribute @Valid Trip trip,
                      Errors errors, Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Trip");
            return "project/add";
        }

        tripDao.save(trip);
        model.addAttribute("trips", tripDao.findAll());
        model.addAttribute("title", "Trips");

        return "project/index";
    }
}
