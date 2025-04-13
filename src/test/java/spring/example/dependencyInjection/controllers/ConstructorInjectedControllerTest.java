package spring.example.dependencyInjection.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import spring.example.dependencyInjection.services.GreetingsServiceImpl;

@SpringBootTest
class ConstructorInjectedControllerTest {

    @Autowired
    ConstructorInjectedController controller;

//    @BeforeEach
//    void setUp() {
//        controller = new ConstructorInjectedController(new GreetingsServiceImpl());
//    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }

}