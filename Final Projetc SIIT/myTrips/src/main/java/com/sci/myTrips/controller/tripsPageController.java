package com.sci.myTrips.controller;

import com.sci.myTrips.entity.Trip;
import com.sci.myTrips.service.ICityService;
import com.sci.myTrips.service.TripService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.plugin2.message.Message;

import javax.annotation.Resource;
import javax.validation.Valid;

@Controller
public class tripsPageController {

    private static final Logger LOGGER = LoggerFactory.getLogger(Trip.class);

    @Autowired
    ICityService cityService;

//    @RequestMapping("/trips")
//    public String findCities(Model model) {
//
//        return "tripsPage";
//    }

    @Resource
    private TripService tripService;




    @RequestMapping(value = "/trips", method = RequestMethod.GET)
    public String displayPage(final Model model) {
        model.addAttribute("trips", new Trip());
        return "trip";
    }

    @RequestMapping(value = "/trips", method = RequestMethod.POST)
    public void processMessage(@ModelAttribute(value = "message") @Valid final Trip trip,
                               final BindingResult bindingResult) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Posting a message");
        }
        tripService.save(trip);
    }
}
