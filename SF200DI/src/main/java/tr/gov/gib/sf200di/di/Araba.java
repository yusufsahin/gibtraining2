package tr.gov.gib.sf200di.di;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Araba {
    private  final  Motor motor;

    @Autowired
    public Araba(Motor motor) {
        this.motor = motor;
    }

    public  void baslat()
    {
        System.out.println(motor.tipGetir()+ " motor başlatıldı");
    }
}
