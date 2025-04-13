package spring.example.dependencyInjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service
public class EnvironmentServiceUaT implements EnvironmentService {
    @Override
    public String getEnvironment() {
        return "UAT";
    }
}
