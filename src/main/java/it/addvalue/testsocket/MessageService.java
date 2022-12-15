package it.addvalue.testsocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * @author Add Value S.p.A. by diego.rigo
 * @version Dec  15, 2022
 * @since 8.3.0
 */
@Service
public class MessageService {

    private final AtomicInteger value = new AtomicInteger(0);
    @Autowired
    public SimpMessageSendingOperations messagingTemplate;

    public void sendMessage() {
        String text = "Message n°" + value.getAndIncrement();
        System.out.println("Sending message: " + text);
        messagingTemplate.convertAndSend( "/topic/greetings", new Greeting(text) );
    }

    @Async
    public void sendMessages() {
        IntStream.range(0,8).forEach(i -> {
            sendMessage();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
