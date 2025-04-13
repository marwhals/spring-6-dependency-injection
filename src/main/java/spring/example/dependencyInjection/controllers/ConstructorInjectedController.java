package spring.example.dependencyInjection.controllers;

import org.springframework.stereotype.Controller;
import spring.example.dependencyInjection.services.GreetingsService;

/**
 * - Best way to do dependency injection is via the constructor
 */
@Controller
public class ConstructorInjectedController {
    private final GreetingsService greetingsService;

    public ConstructorInjectedController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String sayHello() {
        return greetingsService.sayGreeting();
    }

}
