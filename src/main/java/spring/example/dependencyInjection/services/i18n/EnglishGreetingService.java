package spring.example.dependencyInjection.services.i18n;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import spring.example.dependencyInjection.services.GreetingsService;

@Profile("EN")
@Service("i18nService")
public class EnglishGreetingService implements GreetingsService {

    @Override
    public String sayGreeting() {
        return "Hello from EnglishGreetingService";
    }

}
