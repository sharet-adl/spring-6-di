package guru.springframework.spring6di.services.faux;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PROD")
@Service
public class EnvironmentProdService implements IEnvironmentService {
    @Override
    public String getEnvironment() {
        return "PROD DataSource";
    }
}
