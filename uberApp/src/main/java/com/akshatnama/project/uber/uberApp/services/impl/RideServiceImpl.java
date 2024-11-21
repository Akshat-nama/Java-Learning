package com.akshatnama.project.uber.uberApp.services.impl;

import com.akshatnama.project.uber.uberApp.dto.RideRequestDto;
import com.akshatnama.project.uber.uberApp.entities.Driver;
import com.akshatnama.project.uber.uberApp.entities.Ride;
import com.akshatnama.project.uber.uberApp.entities.enums.RideStatus;
import com.akshatnama.project.uber.uberApp.services.RideService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class RideServiceImpl implements RideService {
    @Override
    public Ride getRideByIdI(Long rideId) {
        return null;
    }

    @Override
    public void matchWithDrivers(RideRequestDto rideRequestDto) {

    }

    @Override
    public Ride createNewRide(RideRequestDto rideRequestDto, Driver driver) {
        return null;
    }

    @Override
    public Ride updateRideStatus(Long rideId, RideStatus rideStatus) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest) {
        return null;
    }
}
