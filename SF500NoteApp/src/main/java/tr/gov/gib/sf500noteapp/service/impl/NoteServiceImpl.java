package tr.gov.gib.sf500noteapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.gov.gib.sf500noteapp.dao.NoteRepository;
import tr.gov.gib.sf500noteapp.dao.model.Note;
import tr.gov.gib.sf500noteapp.service.NoteService;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {
    @Autowired
    private NoteRepository noteRepository;
    @Override
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    @Override
    public Note getNoteById(Long id) {
        return noteRepository.findById(id);
    }

    @Override
    public void saveNote(Note note) {
        Note existingNote = noteRepository.findById(note.getId());
        if (existingNote != null) {
            noteRepository.update(note);
        } else {
            noteRepository.save(note);
        }
    }

    @Override
    public void updateNote(Note note) {
        noteRepository.update(note);
    }

    @Override
    public void deleteNoteById(Long id) {
        noteRepository.deleteById(id);
    }
}
