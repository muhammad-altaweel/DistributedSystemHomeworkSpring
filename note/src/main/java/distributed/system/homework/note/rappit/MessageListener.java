package distributed.system.homework.note.rappit;

import distributed.system.homework.note.entity.Note;
import distributed.system.homework.note.service.NoteService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {
    @Autowired
    private NoteService noteService;

    @RabbitListener(queues = MQConfig.QUEUE)
    public void saveNote(Note note) {
        System.out.println(note);
        Note addedNote=noteService.decorateAndSave(note);
        System.out.println();
    }

}
