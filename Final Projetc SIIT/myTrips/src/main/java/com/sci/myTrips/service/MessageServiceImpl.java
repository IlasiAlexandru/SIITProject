package com.sci.myTrips.service;

import com.sci.myTrips.entity.Trip;
import com.sci.myTrips.repo.TripRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MessageServiceImpl implements TripService {

    @Resource
    private TripRepository tripRepository;

    @Override
    public int save(Trip trip) {
        final Trip e = tripRepository
                .save(new Trip(trip.getTripUser(),trip.getTripName(),trip.getDateFrom(), trip.getDateTo(), trip.getFirstImage(), trip.getSecondImage(), trip.getImpressions(), trip.getLocation()));
        if (e == null) {
            throw new IllegalStateException("Message couldn't be persisted");
        }
        return e.getTripId();
    }

}

