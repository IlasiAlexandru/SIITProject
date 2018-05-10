package com.sci.myTrips.controller;

import com.sci.myTrips.entity.City;
import com.sci.myTrips.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class loginController {

    @Autowired
    ICityService cityService;

    @RequestMapping("/login")
    public String login(Model model) {


        return "loginPage";
    }
}
