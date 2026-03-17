package com.example.Addition.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Addition.entity.AdditionEntity;

public interface AdditionRepository extends JpaRepository<AdditionEntity,Long>{
    
}
