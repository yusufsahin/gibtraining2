package tr.gov.gib.sf400contactmanager.dao.impl;

import org.springframework.stereotype.Repository;
import tr.gov.gib.sf400contactmanager.dao.ContactRepository;
import tr.gov.gib.sf400contactmanager.dao.model.Contact;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ContactRepositoryImpl implements ContactRepository {

    private  List<Contact> contacts= new ArrayList<>();

    @Override
    public List<Contact> findAll() {
        return contacts;
    }

    @Override
    public Contact findById(Long id) {
        return contacts
                .stream()
                .filter(contact -> contact.getId()
                        .equals(id))
                        .findFirst()
                        .orElse(null);
    }

    @Override
    public void save(Contact contact) {
        Contact existingContact= findById(contact.getId());

        if(existingContact==null){
            contacts.add(contact);
        }else {
            existingContact.setFirstname(contact.getFirstname());
            existingContact.setLastname(contact.getLastname());
            existingContact.setPhonenumber(contact.getPhonenumber());
        }
    }

    @Override
    public void deleteById(Long id) {
        contacts.removeIf(contact -> contact.getId().equals(id));
    }
}
