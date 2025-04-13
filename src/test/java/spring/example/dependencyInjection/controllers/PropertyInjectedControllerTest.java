package spring.example.dependencyInjection.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import spring.example.dependencyInjection.services.GreetingsServiceImpl;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {

        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingsService = new GreetingsServiceImpl();

    }

    @Test
    void sayHello() {
        System.out.println(propertyInjectedController.sayHello());
    }

}