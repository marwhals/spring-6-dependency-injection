package spring.example.dependencyInjection.controllers;

import org.springframework.stereotype.Controller;
import spring.example.dependencyInjection.services.EnvironmentService;

@Controller
public class EnvironmentController {

    private final EnvironmentService environmentService;

    public EnvironmentController(EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String getEnvironment() {
        return "Currently in: " + environmentService.getEnvironment();
    }

}
