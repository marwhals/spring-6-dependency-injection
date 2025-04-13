package spring.example.dependencyInjection.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import spring.example.dependencyInjection.services.GreetingsServiceImpl;

@SpringBootTest
class SetterInjectedControllerTest {

    @Autowired
    SetterInjectedController setterInjectedController;

//    @BeforeEach
//    void setUp() {
//        setterInjectedController = new SetterInjectedController();
//        setterInjectedController.setGreetingsService(new GreetingsServiceImpl());
//    }

    @Test
    void sayHello() {
        System.out.println(setterInjectedController.sayHello());
    }
}