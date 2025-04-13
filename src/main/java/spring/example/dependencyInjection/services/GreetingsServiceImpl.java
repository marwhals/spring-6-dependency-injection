package spring.example.dependencyInjection.services;

public class GreetingsServiceImpl implements GreetingsService {
    @Override
    public String sayGreeting() {
        return "Hello from GreetingsServiceImpl";
    }
}
