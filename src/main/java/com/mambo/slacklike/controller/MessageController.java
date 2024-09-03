package com.mambo.slacklike.controller;

import com.mambo.slacklike.models.Message;
import com.mambo.slacklike.service.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MessageController {

    MessageService messageService;

    @GetMapping("/messages")
    public List<Message> getMessages() {
        return List.of(new Message());
    }
}
