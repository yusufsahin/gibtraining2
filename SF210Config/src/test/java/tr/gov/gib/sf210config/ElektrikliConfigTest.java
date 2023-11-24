package tr.gov.gib.sf210config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import tr.gov.gib.sf210config.di.Motor;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("elektrikli")
public class ElektrikliConfigTest {
    @Autowired
    private Motor motor;

    @Test
    public void elektrikliMotorTest(){
        assertEquals("Elektrikli",motor.tipGetir());
    }
}
