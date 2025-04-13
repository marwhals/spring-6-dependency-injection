package spring.example.dependencyInjection.services;

import org.springframework.stereotype.Service;

@Service
public interface EnvironmentService {

    String getEnvironment();

}
