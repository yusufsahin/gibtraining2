package tr.gov.gib.sf120applicationcontext.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tr.gov.gib.sf120applicationcontext.service.impl.MyServiceImpl;

@Configuration
public class MyConfig {
    @Bean
    public MyServiceImpl myService()
    {
        return  new MyServiceImpl();
    }
}
