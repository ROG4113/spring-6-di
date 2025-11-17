package com.springframework.spring6di.services.i18n;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.springframework.spring6di.services.GreetingService;

@Profile("ES")
@Service("i18NService")
public class SpanishGreetingService implements GreetingService {

    @Override
    public String SayGreeting() {
        // TODO Auto-generated method stub
        return "Hola Mundo - ES";
    }

}
