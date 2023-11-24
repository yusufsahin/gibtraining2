package tr.gov.gib.sf201withoutdi.di;

public class Araba
{
    private  final  Motor motor= new Motor();

    public  void  baslat()
    {

        System.out.println(motor.tipGetir()+ " motor başlatıldı");
    }
}
