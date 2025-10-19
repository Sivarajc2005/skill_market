package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import java.util.*;

@Entity
@Table(name = "worker_service")
@Data
public class WorkerServices {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int workerServiceId;

    @OneToMany
    @JoinColumn(name = "serviceId")
    private List<Services> services;

    @Column(name = "experience_years")
    private int experienceYears;

    @Column(name = "hourly_rate")
    private int hourlyRate;
}
