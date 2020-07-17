package com.example.demo.controller;


import com.example.demo.domain.CoffeeEntity;
import com.example.demo.repository.CoffeRepository;
import com.example.demo.service.CoffeeService;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class TestController {

    @Autowired
    CoffeRepository coffeRepository;

    @Test
    public void save(){
        final CoffeeEntity coffeeEntity = new CoffeeEntity("Latte","5000");
        final CoffeeEntity saveCoffee = coffeRepository.save(coffeeEntity);
        Assert.assertEquals("Latte", coffeeEntity.getName());

    }

    @Test
    public void find(){
        final CoffeeEntity coffeeEntity = new CoffeeEntity();
        List list1 = coffeRepository.findByName("Americano");

        coffeRepository.findAll();


        Assert.assertEquals("Americano", list1);


    }


}
