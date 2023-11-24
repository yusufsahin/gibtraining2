package tr.gov.gib.sf210config;

import org.junit.jupiter.api.Test;
import tr.gov.gib.sf210config.di.Araba;
import tr.gov.gib.sf210config.di.Motor;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ArabaTest
{
    @Test
    public  void baslatTest()
    {
        Motor mockMotor= new Motor("Benzinli");

        Araba araba= new Araba(mockMotor);

        assertNotNull(araba);
    }
}
