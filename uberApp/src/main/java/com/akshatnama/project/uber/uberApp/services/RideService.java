package com.akshatnama.project.uber.uberApp.services;

import com.akshatnama.project.uber.uberApp.dto.RideRequestDto;
import com.akshatnama.project.uber.uberApp.entities.Driver;
import com.akshatnama.project.uber.uberApp.entities.Ride;
import com.akshatnama.project.uber.uberApp.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {

    Ride getRideByIdI(Long rideId);

    void matchWithDrivers(RideRequestDto rideRequestDto);

    Ride createNewRide(RideRequestDto rideRequestDto, Driver driver);

    Ride updateRideStatus(Long rideId, RideStatus rideStatus);

    Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest);


}
