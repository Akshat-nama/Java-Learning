package com.akshatnama.project.uber.uberApp.services;

import com.akshatnama.project.uber.uberApp.dto.DriverDto;
import com.akshatnama.project.uber.uberApp.dto.RideDto;
import com.akshatnama.project.uber.uberApp.dto.RiderDto;

import java.util.List;

public interface DriverService {
    RideDto acceptRide(Long rideId);

    RideDto cancelRide(Long rideId);

    RideDto startRide(Long rideId);

    RideDto endRide(Long rideId);

    RiderDto rateRider(Long riderId, Integer rating);

    DriverDto getMyProfile();

    List<RideDto> getAllMyRides();

}
