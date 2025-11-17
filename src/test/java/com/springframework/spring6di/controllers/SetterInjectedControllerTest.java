package com.springframework.spring6di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springframework.spring6di.services.GreetingServiceImpl;

@SpringBootTest
public class SetterInjectedControllerTest {
    @Autowired
    private SetterInjectedController setterInjectedController;
    
    // @BeforeEach
    // void setUp(){
    //     setterInjectedController=new SetterInjectedController();
    //     setterInjectedController.setGreetingService(new GreetingServiceImpl());
    // }

    @Test
    void testSayHello() {
        System.out.println(setterInjectedController.sayHello());
    }
}
