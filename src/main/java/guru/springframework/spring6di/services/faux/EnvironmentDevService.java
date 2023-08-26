package guru.springframework.spring6di.services.faux;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile(value = {"DEV", "default"})
@Service
public class EnvironmentDevService implements IEnvironmentService {
    @Override
    public String getEnvironment() {
        return "DEV DataSource";
    }
}
