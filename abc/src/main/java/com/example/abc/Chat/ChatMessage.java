package com.example.abc.Chat;

import lombok.Builder;
import lombok.Getter;

import java.awt.*;
@Getter
@Builder
public class ChatMessage {

    private  String content;

    private  String timestamp;

    private  String sender;

    private MessageType type;
}
