package tr.gov.gib.sf121lombok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tr.gov.gib.sf121lombok.dao.entity.Mukellef;

@SpringBootApplication
public class Sf121LombokApplication {

    public static void main(String[] args) {
        Mukellef mukellef= new Mukellef();

        mukellef.setAd("Test");
        mukellef.setSoyad("Test Soyad");
        mukellef.setVKN("3456678996");

        Mukellef mukellef1= new Mukellef("789902346","Test 2","Test Soyad 2");

        System.out.println(mukellef.toString());
        System.out.println(mukellef1.toString());

        SpringApplication.run(Sf121LombokApplication.class, args);
    }

}
