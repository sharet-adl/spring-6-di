package guru.springframework.spring6di.controllers.i18;

import guru.springframework.spring6di.services.IGreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class Myi18NController {
    private final IGreetingService greetingService;

    public Myi18NController(@Qualifier("i18NService") IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
