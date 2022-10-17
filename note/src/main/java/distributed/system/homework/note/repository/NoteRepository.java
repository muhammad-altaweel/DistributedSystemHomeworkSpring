package distributed.system.homework.note.repository;

import distributed.system.homework.note.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
    //Note findNoteById(Long noteId);
}
