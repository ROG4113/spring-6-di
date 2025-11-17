package com.springframework.spring6di.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.springframework.spring6di.services.GreetingService;

// Most preferred way to inject
@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;
    // asking specifically to use greetingServiceImpl
    public ConstructorInjectedController(@Qualifier("greetingServiceImpl") GreetingService greetingService){
        this.greetingService=greetingService;
    }

    public String sayHello(){
        return greetingService.SayGreeting();
    }
}
