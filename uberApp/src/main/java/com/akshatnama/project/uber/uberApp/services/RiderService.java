package com.akshatnama.project.uber.uberApp.services;

import com.akshatnama.project.uber.uberApp.dto.DriverDto;
import com.akshatnama.project.uber.uberApp.dto.RideDto;
import com.akshatnama.project.uber.uberApp.dto.RideRequestDto;
import com.akshatnama.project.uber.uberApp.dto.RiderDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RiderService {
    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto getMyProfile();

    List<RideDto> getAllMyRides();

}
