package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

// give custom name to the bean
@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Friends don't let friend do property injection !!! ";
    }
}
