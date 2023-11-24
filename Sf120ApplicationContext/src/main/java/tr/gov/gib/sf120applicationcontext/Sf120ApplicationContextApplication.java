package tr.gov.gib.sf120applicationcontext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import tr.gov.gib.sf120applicationcontext.service.impl.MyServiceImpl;

@SpringBootApplication
public class Sf120ApplicationContextApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context= SpringApplication.run(Sf120ApplicationContextApplication.class);

        MyServiceImpl myService= context.getBean(MyServiceImpl.class);

        myService.printMessage();
    //    SpringApplication.run(Sf120ApplicationContextApplication.class, args);
    }

}
