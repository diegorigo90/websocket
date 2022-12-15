package it.addvalue.testsocket.controller;

import it.addvalue.testsocket.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Add Value S.p.A. by diego.rigo
 * @version Dec  15, 2022
 * @since 8.3.0
 */
@RestController
public class MessageController {
    @Autowired
    MessageService messageService;

    @GetMapping("/cippa")
    public void greeting1() {
        messageService.sendMessages();
    }
}
