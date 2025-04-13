package spring.example.dependencyInjection.controllers;

import spring.example.dependencyInjection.services.GreetingsService;

public class PropertyInjectedController {

    GreetingsService greetingsService;

    public String sayHello() {
        return greetingsService.sayGreeting();
    }

}
