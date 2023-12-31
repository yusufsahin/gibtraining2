package tr.gov.gib.sf210config.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import tr.gov.gib.sf210config.di.Motor;

@Configuration
@Profile("benzinli")
public class BenzinliConfig {

    @Bean
    public Motor motor()
    {
        return  new Motor("Benzinli");
    }
}
