package spring.example.dependencyInjection.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingsService {

    @Override
    public String sayGreeting() {
        return "Friends don't let friends to property injection.....!!!!";
    }

}
