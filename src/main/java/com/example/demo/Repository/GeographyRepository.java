package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Geography;

public interface GeographyRepository extends JpaRepository<Geography, Integer> {
    
}
