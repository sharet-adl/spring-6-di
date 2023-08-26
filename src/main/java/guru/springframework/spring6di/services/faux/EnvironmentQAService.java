package guru.springframework.spring6di.services.faux;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("QA")
@Service
public class EnvironmentQAService implements IEnvironmentService {
    @Override
    public String getEnvironment() {
        return "QA DataSource";
    }
}
