package distributed.system.homework.note.controller;

import distributed.system.homework.note.entity.Note;
import distributed.system.homework.note.service.NoteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notes")
@Slf4j
public class NoteController {
    @Autowired
    private NoteService noteService;

//    @PostMapping("/add")
//    public Note saveNote(Note note){
//        System.out.println("note before"+note);
//        return noteService.decorateAndSave(note);
//    }

    @GetMapping("/{noteId}")
    public Note findNoteById(@PathVariable Long noteId) {
        return noteService.findNoteById(noteId);
    }
}
