package com.example.demo.repository;

import com.example.demo.domain.CoffeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoffeRepository extends JpaRepository<CoffeeEntity, Long> {


    public List<CoffeeEntity> findByName(String name);



}
