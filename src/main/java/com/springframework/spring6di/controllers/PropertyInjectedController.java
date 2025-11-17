package com.springframework.spring6di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.springframework.spring6di.services.GreetingService;

@Controller
public class PropertyInjectedController {
    // asking specifically to use propertyGreetingSrvice
    @Qualifier("propertyGreetingService")
    @Autowired
    GreetingService greetingService;

    public String sayHello(){
        return greetingService.SayGreeting();
    }

}
