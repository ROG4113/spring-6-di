package com.springframework.spring6di.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

// custom naming
@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingService {
    @Override
    public String SayGreeting() {
        // TODO Auto-generated method stub
        return "Friends don't help friends to property injection!!";
    }

}
