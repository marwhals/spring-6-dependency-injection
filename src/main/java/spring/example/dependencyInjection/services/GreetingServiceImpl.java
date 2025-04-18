package spring.example.dependencyInjection.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingsService {
    @Override
    public String sayGreeting() {
        return "Hello from GreetingsServiceImpl";
    }
}
