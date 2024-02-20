package com.websocket.demo.chat;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ChatMessage {
    @Getter
    static private int count=0;
    private String content;
    private String timestamp;
    private String sender;
    private MessageType type;
    private int countex;

    public static void setCount(int i){
        count += i;
    }
    public void setCountExp(){
        countex = count;
    }
}
