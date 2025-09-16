package com.example.demo.Entity;

import java.util.Date;

import com.example.demo.Entity.Enums.Role;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Getter
@Setter
@Entity
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;

    @Column(unique = true , name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "password_hash")
    private String passwordHash;

    @Column(name = "full_name")
    private String fullName;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Role role;         // ADMINE , USER , EMPLOYEE

    @Column(name = "is_active")
    private boolean isActive;

    @Column(name = "pincode" , nullable = false)
    private String pincode;

    @Column(name = "created_at" , updatable= false)
    @CreationTimestamp
    private Date createdAt;


    @Column(name = "updated_at")
    @UpdateTimestamp
    private Date updatedAt;


    @Column(name = "profile_photo")
    private String profile;

}



