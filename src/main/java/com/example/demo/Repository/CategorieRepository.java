package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Integer> {
    
}
