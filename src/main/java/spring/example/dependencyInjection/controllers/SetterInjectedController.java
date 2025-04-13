package spring.example.dependencyInjection.controllers;

import spring.example.dependencyInjection.services.GreetingsService;

public class SetterInjectedController {
    private GreetingsService greetingsService;

    public void setGreetingsService(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String sayHello() {
        return greetingsService.sayGreeting();
    }
}
