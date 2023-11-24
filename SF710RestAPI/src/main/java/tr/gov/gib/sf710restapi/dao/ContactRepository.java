package tr.gov.gib.sf710restapi.dao;

import tr.gov.gib.sf710restapi.dao.model.Contact;

import java.util.List;

public interface ContactRepository {
    List<Contact> getAll();
    Contact getById(int id);
    Contact insert(Contact contact);
    Contact update(Contact contact);
    void delete(int id);
}
