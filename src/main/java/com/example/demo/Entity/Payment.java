package com.example.demo.Entity;

import com.example.demo.Entity.Enums.PaymentMethod;
import com.example.demo.Entity.Enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int paymentId;

    @OneToOne(cascade = CascadeType.ALL)
    private Booking bookingId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="userId")
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "workerId")
    private WorkerProfile workerProfile;

    private PaymentMethod paymentMethod;

    private PaymentStatus paymentStatus;
    
}