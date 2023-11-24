package tr.gov.gib.sf400contactmanager.dao;

import tr.gov.gib.sf400contactmanager.dao.model.Contact;

import java.util.List;

public interface ContactRepository {
    List<Contact> findAll();
    Contact findById(Long id);
    void  save(Contact contact);
    void deleteById(Long id);
}
