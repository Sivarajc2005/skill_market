package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int val;

    @OneToMany
    @Column(name = "name")
    private String name;

}
