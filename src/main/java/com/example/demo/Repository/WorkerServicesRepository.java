package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.WorkerServices;

public interface WorkerServicesRepository extends JpaRepository<WorkerServices,Integer> {
    
}
