package tr.gov.gib.sf001hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sf001HelloSpringApplication {

    public static void main(String[] args) {
        System.out.println("Hello Spring!");
        SpringApplication.run(Sf001HelloSpringApplication.class, args);
    }

}
