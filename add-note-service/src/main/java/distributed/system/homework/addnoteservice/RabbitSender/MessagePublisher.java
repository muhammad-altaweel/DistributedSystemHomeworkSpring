package distributed.system.homework.addnoteservice.RabbitSender;

import distributed.system.homework.addnoteservice.RabbitConfiq.MQConfig;
import distributed.system.homework.addnoteservice.entity.Note;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/post")
@Slf4j
public class MessagePublisher {

    @Autowired
    private RabbitTemplate template;
    @Autowired
    RestTemplate restTemplate;

    @PostMapping("/")
    public String publishMessage(@RequestBody Note note) {
        SendToRabbit(note);
        return "Message Published";
    }
    @Async
    public void SendToRabbit(Note note)
    {
        template.convertAndSend(MQConfig.EXCHANGE,
                MQConfig.ROUTING_KEY, note);
    }
    @Async
    public String getUser(Long id){
        return restTemplate.getForObject(
                "http://USER-SERVICE/users/"+id.toString()
                ,String.class);
    }

}
