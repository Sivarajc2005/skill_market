package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.WorkerProfile;

public interface WorkerProfileRepository extends JpaRepository<WorkerProfile,Integer> {
    
}
