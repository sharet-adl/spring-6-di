package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import java.sql.SQLOutput;

@Controller
public class SetterInjectedController {

    // if annotated here, then the Setter will not get invoked ! Reflection done directly !
    //@Qualifier("setterGreetingBean")
    //@Autowired
    private IGreetingService greetingService;


    @Autowired
    @Qualifier("setterGreetingBean")
    public void setGreetingService(IGreetingService greetingService) {
        System.out.println("SetterInjectedController - forced to call the setter - slow, using Reflection !ß");
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
