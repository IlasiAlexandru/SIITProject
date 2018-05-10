package com.sci.myTrips.service;

import com.sci.myTrips.entity.Trip;
import org.springframework.data.repository.CrudRepository;

public interface TripService {

    int save(final Trip trip);
}
