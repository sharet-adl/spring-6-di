package guru.springframework.spring6di.controllers;


import guru.springframework.spring6di.services.IGreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final IGreetingService greetingService;

    public ConstructorInjectedController(/*@Qualifier("greetingService")*/ IGreetingService greetingService) {
        // could add check for null ptr passed
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
