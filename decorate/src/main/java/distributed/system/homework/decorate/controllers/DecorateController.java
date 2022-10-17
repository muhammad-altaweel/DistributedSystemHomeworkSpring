package distributed.system.homework.decorate.controllers;

import distributed.system.homework.decorate.DTO.Note;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/decorate")
@Slf4j
public class DecorateController {
    //    @Value("${spring.profiles}")
//    public String zone;
    @LoadBalanced
    @PostMapping("/")
    public Note Decorate(@RequestBody Note note) {
        String s = note.getNoteContent();
        s = "{\n" + s + "\n}";
        note.setNoteContent(s);
        System.out.println(note);
        return note;
    }
//    @GetMapping("/ping")
//    public String ping(){
//        return "ping decorate service " + zone;
//    }
}
