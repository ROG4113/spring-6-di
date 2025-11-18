package com.springframework.spring6di.controllers;

import org.springframework.stereotype.Controller;

import com.springframework.spring6di.services.GreetingService;
import com.springframework.spring6di.services.GreetingServiceImpl;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("I am in the Controller");
        return  greetingService.SayGreeting();
    }

    public void beforeInit(){
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("## - After init called by Bean Post Processor");
    }
}
