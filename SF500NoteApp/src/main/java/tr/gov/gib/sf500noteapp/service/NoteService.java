package tr.gov.gib.sf500noteapp.service;

import tr.gov.gib.sf500noteapp.dao.model.Note;

import java.util.List;

public interface NoteService {
    List<Note> getAllNotes();
    Note getNoteById(Long id);
    void saveNote(Note note);
    void updateNote(Note note);
    void deleteNoteById(Long id);
}
