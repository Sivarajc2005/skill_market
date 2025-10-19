package com.example.demo.Entity;


import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

 @Getter
 @Setter
@Entity
@Table(name = "worker_profile")
public class WorkerProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int workerId;

    @OneToOne(fetch = FetchType.LAZY)  // fetch = FetchType.LAZY --> avoid fetching data unwantedly
    @JoinColumn(name = "user_id" , nullable = false)
    private User user;

    @Column(name="headline")
    private String headline;

    @Column(name = "about")
    private String about;

    @Column(name = "pincode")
    private String pincode;

    @Embedded
    private Geography geoPoint;

    @Column(name= "rating_avg",precision = 3, scale = 2)
    private BigDecimal ratingAvg;

    @Column(name = "rating_count")
    private int ratingCount;

    @Column(name = "is_verified" , precision = 3 , scale = 2)
    private Boolean isVerified;

    @OneToOne
    @JoinColumn(name = "workerServiceId")
    private WorkerServices workerServices;
}