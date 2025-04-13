package spring.example.dependencyInjection.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjection {

    @Override
    public String toString() {
        return "Hey I am setting a greeting!!!!";
    }

}
