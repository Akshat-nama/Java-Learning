package com.akshatnama.project.uber.uberApp.strategies;

import com.akshatnama.project.uber.uberApp.dto.RideRequestDto;

public interface RideFareCalculationStrategy {
    double calculateFare (RideRequestDto rideRequestDto);
}
