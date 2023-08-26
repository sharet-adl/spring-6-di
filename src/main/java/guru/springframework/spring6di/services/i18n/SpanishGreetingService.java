package guru.springframework.spring6di.services.i18n;

import guru.springframework.spring6di.services.IGreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18NService")
public class SpanishGreetingService implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
