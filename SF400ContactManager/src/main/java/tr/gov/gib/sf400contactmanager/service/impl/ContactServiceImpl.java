package tr.gov.gib.sf400contactmanager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.gov.gib.sf400contactmanager.dao.impl.ContactRepositoryImpl;
import tr.gov.gib.sf400contactmanager.dao.model.Contact;
import tr.gov.gib.sf400contactmanager.service.ContactService;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepositoryImpl contactRepository;
    @Override
    public String getContactsAsString() {
        List<Contact> contacts = contactRepository.findAll();
        StringBuilder sb = new StringBuilder();

        sb.append("ID    | First Name | Last Name | Phone Number\n");
        sb.append("---------------------------------------------\n");

        for (Contact contact : contacts) {
            sb.append(contact.getId()).append(" | ")
                    .append(contact.getFirstname()).append(" | ")
                    .append(contact.getLastname()).append(" | ")
                    .append(contact.getPhonenumber()).append("\n")
                    .append("---------------------------------------------\n");
        }

        return sb.toString();
    }
}
