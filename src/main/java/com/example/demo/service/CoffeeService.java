package com.example.demo.service;

import com.example.demo.repository.CoffeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CoffeeService {

    @Autowired
    private CoffeRepository coffeRepository;
}
