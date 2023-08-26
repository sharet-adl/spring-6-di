package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.sql.SQLOutput;

@Controller
public class SetterInjectedController {

    //@Autowired
    private GreetingService greetingService;

    public GreetingService getGreetingService() {
        return greetingService;
    }

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        System.out.println("SetterInjectedController - forced to call the setter - slow, using Reflection !ß");
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
