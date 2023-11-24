package tr.gov.gib.sf210config;

import org.junit.jupiter.api.Test;
import tr.gov.gib.sf210config.di.Motor;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotorTest {

    @Test
    public void tipGetirTest()
    {
        Motor motor= new Motor("Benzinli");
        assertEquals("Benzinli",motor.tipGetir());
    }
}
