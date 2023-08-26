package guru.springframework.spring6di.controllers;


import guru.springframework.spring6di.services.IGreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final IGreetingService greetingService;

    // ! Naming it 'greetingService' give it priority over the other beans inthe context that implements same Interface !!!
    //   - to force reproduce error, just modify the name 'greetingService' --> whatever
    //   - if left like this, other beans can take priority using standar methods (@Priority, @Qualifier.. )
    public ConstructorInjectedController(IGreetingService greetingService) {
        // could add check for null ptr passed
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
