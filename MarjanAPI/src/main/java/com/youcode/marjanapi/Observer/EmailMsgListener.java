package com.youcode.marjanapi.Observer;

import org.springframework.stereotype.Component;

@Component
public class EmailMsgListener {
    public void update() {
        System.out.println("users notified");
    }
}
