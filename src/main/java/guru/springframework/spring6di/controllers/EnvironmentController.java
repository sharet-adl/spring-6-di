package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.faux.IEnvironmentService;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {
    private final IEnvironmentService environmentService;


    public EnvironmentController(IEnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String getEnvironment() {
        return "You are in " + environmentService.getEnvironment() + " environment";
    }
}
