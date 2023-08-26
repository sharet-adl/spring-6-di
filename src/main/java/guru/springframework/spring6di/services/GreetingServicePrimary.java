package guru.springframework.spring6di.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Primary
@Service
public class GreetingServicePrimary implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from GreetingServicePrimary !";
    }
}
