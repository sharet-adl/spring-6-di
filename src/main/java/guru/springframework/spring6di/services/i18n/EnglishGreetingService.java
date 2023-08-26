package guru.springframework.spring6di.services.i18n;

import guru.springframework.spring6di.services.IGreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18NService")
public class EnglishGreetingService implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world - EN";
    }
}
