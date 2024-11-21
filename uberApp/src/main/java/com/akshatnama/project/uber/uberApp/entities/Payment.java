package com.akshatnama.project.uber.uberApp.entities;

import com.akshatnama.project.uber.uberApp.entities.enums.PaymentMethod;
import com.akshatnama.project.uber.uberApp.entities.enums.PaymentStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

public class Payment {

    private Long id;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @OneToOne(fetch = FetchType.LAZY)
    private Ride ride;

    private Double amount;

    @CreationTimestamp
    private LocalDateTime paymentTime;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
}
