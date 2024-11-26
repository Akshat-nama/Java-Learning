package com.akshatnama.project.uber.uberApp.dto;

import com.akshatnama.project.uber.uberApp.entities.Driver;
import com.akshatnama.project.uber.uberApp.entities.Rider;
import com.akshatnama.project.uber.uberApp.entities.enums.PaymentMethod;
import com.akshatnama.project.uber.uberApp.entities.enums.RideStatus;
import jakarta.persistence.*;
import org.geolatte.geom.Point;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

public class RideDto {

    private Long id;
    private Point pickupLocation;
    private Point dropOffLocation;

    private LocalDateTime createdTime;
    private RiderDto rider;
    private DriverDto driver;
    private PaymentMethod paymentMethod;

    private RideStatus rideStatus;

    private String otp;

    private Double fare;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
}
