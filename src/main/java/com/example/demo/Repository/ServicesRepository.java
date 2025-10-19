package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Services;

public interface ServicesRepository extends JpaRepository<Services,Integer>{
	
}
