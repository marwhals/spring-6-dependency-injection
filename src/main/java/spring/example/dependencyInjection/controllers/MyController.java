package spring.example.dependencyInjection.controllers;

import org.springframework.stereotype.Controller;
import spring.example.dependencyInjection.services.GreetingsService;
import spring.example.dependencyInjection.services.GreetingsServiceImpl;

@Controller
public class MyController {

    private final GreetingsService greetingsService;

    public MyController() {
        this.greetingsService = new GreetingsServiceImpl();
    }

    public String sayHello() {
        System.out.println("Hello from MyController");
        return "woop";
    }
}
