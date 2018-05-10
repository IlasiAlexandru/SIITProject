package com.sci.myTrips.repo;

import com.sci.myTrips.entity.Trip;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripRepository extends CrudRepository<Trip, Long> {


}
