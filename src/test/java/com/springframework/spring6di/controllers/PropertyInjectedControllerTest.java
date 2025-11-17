package com.springframework.spring6di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.springframework.spring6di.services.GreetingServiceImpl;

public class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp(){
        propertyInjectedController=new PropertyInjectedController();
        propertyInjectedController.greetingService=new GreetingServiceImpl();
    }

    @Test
    void sayHello(){
        System.out.println(propertyInjectedController.sayHello());
    }
}
