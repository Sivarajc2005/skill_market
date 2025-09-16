package com.example.demo.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "worker_profile")
public class WorkerProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne(fetch = FetchType.LAZY)  // fetch = FetchType.LAZY --> avoid fetching data unwantedly
    @JoinColumn(name = "user_id" , nullable = false)
    private User user;

    @Column(name="headline")
    private String headline;

    @Column(name = "about")
    private String about;

    @Column(name = "experience_years")
    private int experienceYears;

    @Column(name = "hourly_rate")
    private int hourlyRate;

    @Column(name = "pincode")
    private String pincode;


    private Geography geoPoint;

    @Column(name= "rating_avg",precision = 3, scale = 2)
    private Double ratingAvg;

    @Column(name = "rating_count")
    private int ratingCount;

    @Column(name = "is_verified")
    private Boolean isVerified;
}
