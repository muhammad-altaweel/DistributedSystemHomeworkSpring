package distributed.system.homework.gateway.controllers;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddNoteFallBackController {
    @PostMapping("/AddNoteFallBack")
    public String addNoteFallBackMethode() {
        return "The Add Note Service Currently Unavailable";
    }
}
