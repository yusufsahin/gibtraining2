package tr.gov.gib.sf400contactmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tr.gov.gib.sf400contactmanager.service.impl.ContactServiceImpl;

@Controller
public class ContactController {
    @Autowired
    private ContactServiceImpl contactService;

    @GetMapping("/contacts")
    @ResponseBody
    public  String getContact()
    {
        return  contactService.getContactsAsString();
    }
}
