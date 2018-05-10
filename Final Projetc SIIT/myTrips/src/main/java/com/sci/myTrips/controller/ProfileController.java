package com.sci.myTrips.controller;

import com.sci.myTrips.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/profile")
public class ProfileController {
    @Autowired
    ICityService cityService;

    @RequestMapping("/profile")
    public String findCities(Model model) {


        return "profilePage";
    }
}
