package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjection implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "GreetingServiceSetterInjection greeting !";
    }
}
