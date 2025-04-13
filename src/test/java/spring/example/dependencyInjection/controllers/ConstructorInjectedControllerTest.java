package spring.example.dependencyInjection.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import spring.example.dependencyInjection.services.GreetingsServiceImpl;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingsServiceImpl());
    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }

}