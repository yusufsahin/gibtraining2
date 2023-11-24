package tr.gov.gib.SF101HelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sf101HelloWorldApplication {

	public static void main(String[] args) {
		System.out.println("Hello Spring!");
		SpringApplication.run(Sf101HelloWorldApplication.class, args);
	}

}
