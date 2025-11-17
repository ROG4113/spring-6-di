package com.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjection implements GreetingService {

    @Override
    public String SayGreeting() {
        // TODO Auto-generated method stub
        return "Hey, I am Setting a Greeting!!";
    }

}
