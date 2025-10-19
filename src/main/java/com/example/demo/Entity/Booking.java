package com.example.demo.Entity;


import com.example.demo.Entity.Enums.Status;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Setter
@Getter
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookingId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="userId")
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "workerId")
    private WorkerProfile workerProfile;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "serviceId")
    private Services service;

    private String scheduleStart;

    private String scheduleEnd;

    private int estimatedCost;

    private Status status;

    private String createdAt;

    private String updatedAt;

    private String completedAt;

    private String cancellationReason;
}
