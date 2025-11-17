package com.springframework.spring6di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServicePrimary implements GreetingService {
    @Override
    public String SayGreeting() {
        // TODO Auto-generated method stub
        return "Hello from the Primary Bean!!";
    }

}
