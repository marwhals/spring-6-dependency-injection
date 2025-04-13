package spring.example.dependencyInjection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import spring.example.dependencyInjection.services.GreetingsService;

@Controller
public class SetterInjectedController {

    @Autowired
    private GreetingsService greetingsService;

    public void setGreetingsService(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String sayHello() {
        return greetingsService.sayGreeting();
    }
}
