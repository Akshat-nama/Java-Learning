package com.akshatnama.project.uber.uberApp.strategies;

import com.akshatnama.project.uber.uberApp.dto.RideRequestDto;
import com.akshatnama.project.uber.uberApp.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequestDto rideRequestDto);
}
