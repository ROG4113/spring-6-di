package com.springframework.spring6di.controllers;

import com.springframework.spring6di.services.GreetingService;

public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService){
        this.greetingService=greetingService;
    }

    public String sayHello(){
        return greetingService.SayGreeting();
    }
}
