package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import guru.springframework.spring6di.services.IGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final IGreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingService();
    }

    public String sayHello() {
        System.out.println("Printing hello from MyController ..");
        return greetingService.sayGreeting();
    }

    public void beforeInit() {
        System.out.println("## - Before Init - called by Bean Post Processor");
    }

    public void afterInit() {
        System.out.println("## - After Init called by Bean Post Processor");
    }
}
