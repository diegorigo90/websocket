package it.addvalue.testsocket.controller;

import it.addvalue.testsocket.dto.Greeting;
import it.addvalue.testsocket.dto.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(String message) throws Exception {
        return new Greeting(HtmlUtils.htmlEscape(message));
    }

}