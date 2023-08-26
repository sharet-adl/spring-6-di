package guru.springframework.spring6di.services.faux;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("UAT")
@Service
public class EnvironmentUATService implements IEnvironmentService {
    @Override
    public String getEnvironment() {
        return "UAT DataSource";
    }
}
