package com.mambo.slacklike.models;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.security.Timestamp;

/**
 * Message POJO that will contain the details of a message
 */
@Getter
@Setter
public class Message {

    @NonNull
    private String content;

    @NonNull
    private Timestamp timestamp;

    private Message parentMessage;

    private boolean read;
}
