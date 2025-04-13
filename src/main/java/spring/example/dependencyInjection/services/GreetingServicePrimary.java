package spring.example.dependencyInjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServicePrimary implements GreetingsService {

    @Override
    public String sayGreeting() {
        return "Hello from the Primary Bean";
    }

}
