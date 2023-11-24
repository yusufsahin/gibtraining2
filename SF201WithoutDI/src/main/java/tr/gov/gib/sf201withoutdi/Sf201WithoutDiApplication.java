package tr.gov.gib.sf201withoutdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tr.gov.gib.sf201withoutdi.di.Araba;

@SpringBootApplication
public class Sf201WithoutDiApplication {

    public static void main(String[] args) {

        //SpringApplication.run(Sf201WithoutDiApplication.class, args);
        Araba araba= new Araba();

        araba.baslat();

    }

}
