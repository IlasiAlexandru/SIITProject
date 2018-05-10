package com.sci.myTrips.controller;


import java.util.List;

import com.sci.myTrips.entity.City;
import com.sci.myTrips.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MyController {
//
//    @Autowired
//    ICityService cityService;
//
//    @RequestMapping("/showCities")
//    public String findCities(Model model) {
//
//        List<City> cities = (List<City>) cityService.findAll();
//
//        model.addAttribute("cities", cities);
//
//        return "showCities";
//    }
}
