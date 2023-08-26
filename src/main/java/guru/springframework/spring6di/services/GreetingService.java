package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from base!";
    }
}
