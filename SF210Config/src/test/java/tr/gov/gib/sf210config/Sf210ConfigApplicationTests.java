package tr.gov.gib.sf210config;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import tr.gov.gib.sf210config.di.Araba;

@SpringBootTest
class Sf210ConfigApplicationTests {

    @Autowired
    private Araba araba;

    @MockBean
    private Araba mockAraba;

    @Test
    void contextLoads() {
    }

    @Test
    void arabaBaslatIsCalled(){
        araba.baslat();
        Mockito.verify(mockAraba,Mockito.times(1)).baslat();
    }
}
