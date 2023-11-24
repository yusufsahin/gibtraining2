package tr.gov.gib.sf500noteapp.dao;

import tr.gov.gib.sf500noteapp.dao.model.Note;

import java.util.List;

public interface NoteRepository {
    List<Note> findAll();
    Note findById(Long id);
    void save(Note note);
    void update(Note note);
    void deleteById(Long id);

    void saveAll(List<Note> list);
}
