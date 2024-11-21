package com.akshatnama.project.uber.uberApp.strategies.impl;

import com.akshatnama.project.uber.uberApp.dto.RideRequestDto;
import com.akshatnama.project.uber.uberApp.strategies.RideFareCalculationStrategy;

public class RideFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDto rideRequestDto) {
        return 0;
    }
}