package tr.gov.gib.sf500noteapp.dao.impl;

import org.springframework.stereotype.Repository;
import tr.gov.gib.sf500noteapp.dao.NoteRepository;
import tr.gov.gib.sf500noteapp.dao.model.Note;

import java.util.ArrayList;
import java.util.List;

@Repository
public class NoteRepositoryImpl implements NoteRepository {

    private List<Note> notes= new ArrayList<>();
    private Long idCounter=1L;

    @Override
    public List<Note> findAll() {
        return notes;
    }

    @Override
    public Note findById(Long id) {
        return notes.stream().filter(
                note -> note.getId().equals(id)
        ).findFirst().orElse(null);
    }

    @Override
    public void save(Note note) {
        if(note.getId()==null){
            note.setId(idCounter++);
        }
        notes.add(note);
    }
    @Override
    public void update(Note note) {
        Note exisitingNote= findById(note.getId());
        if(exisitingNote!=null)
        {
            exisitingNote.setName(note.getName());
            exisitingNote.setDescription(note.getDescription());
        }
    }

    @Override
    public void deleteById(Long id) {
        notes.removeIf(note -> note.getId().equals(id));
    }

    @Override
    public void saveAll(List<Note> list) {
        for (Note note:list){
            if (note.getId()==null)
            {
                note.setId(idCounter++);
            }
        }
        notes.addAll(list);
    }
}
