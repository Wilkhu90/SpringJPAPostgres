package com.wilkhu.keeper;

import com.wilkhu.keeper.entity.Person;
import com.wilkhu.keeper.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class SchedulerMessage {
    @Autowired
    private SimpMessagingTemplate template;
    @Autowired
    private PersonService personService;

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public List<Person> greeting() throws Exception{
        return personService.findAll();
    }

    @Scheduled(fixedDelay = 500)
    public String test() {
        template.convertAndSend("/topic/greetings", personService.findAll());
        return "Hel";
    }
}
