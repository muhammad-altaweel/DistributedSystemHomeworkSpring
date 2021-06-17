package distributed.system.homework.note.service;

import distributed.system.homework.note.entity.Note;
import distributed.system.homework.note.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NoteService {
    @Autowired
    private NoteRepository noteRepository;
    @Autowired
    private RestTemplate restTemplate;

    public Note saveNote(Note note){
        return noteRepository.save(note);
    }

    public Note findNoteById(Long noteId){
        return noteRepository.findById(noteId).get();
    }

    public Note decorateAndSave(Note note){
        Note decoratedNote = restTemplate.postForObject(
                "http://DECORATE-SERVICE/decorate/"
                ,note
                ,Note.class);
        return saveNote(decoratedNote);
    }

}
