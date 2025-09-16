package com.example.demo.Entity;

import jakarta.persistence.*;




@Entity
@Table(name = "services")
public class Services {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Categorie categorie;


    private String name;
}
