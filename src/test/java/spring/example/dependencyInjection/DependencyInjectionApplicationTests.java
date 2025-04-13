package spring.example.dependencyInjection;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import spring.example.dependencyInjection.controllers.MyController;

@SpringBootTest
class DependencyInjectionApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController myController;

	@Test
		// This test checks if the MyController bean is correctly autowired and invokes its sayHello method.
	void testAutowireOfController() {
		System.out.println(myController.sayHello());
	}

	@Test
	void testGetControllerFromCtx() {
		MyController myController = applicationContext.getBean(MyController.class);
		System.out.println(myController.sayHello());
	}

	@Test
	void contextLoads() {
	}

}
