package spring.example.dependencyInjection.controllers.i18n;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import spring.example.dependencyInjection.services.GreetingsService;

@Controller
public class Myi18nController {

    private final GreetingsService greetingsService;

    public Myi18nController(@Qualifier("i18nService") GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String sayHello() {
        return greetingsService.sayGreeting();
    }

}
