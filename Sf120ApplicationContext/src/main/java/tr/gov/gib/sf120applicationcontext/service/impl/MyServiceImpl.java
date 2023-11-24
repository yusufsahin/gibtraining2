package tr.gov.gib.sf120applicationcontext.service.impl;

import tr.gov.gib.sf120applicationcontext.service.MyService;

public class MyServiceImpl implements MyService {

    @Override
    public  void  printMessage()
    {
        System.out.println("Merhaba,Spring Boot!");
    }
}
