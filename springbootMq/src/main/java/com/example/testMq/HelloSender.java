package com.example.testMq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * author zhangyj
 * date 2018/8/8 11:26
 * version 2.0
 */
@Component
public class HelloSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String context = "hello " + new Date();
        System.out.println("====================>Sender : " + context);
        this.rabbitTemplate.convertAndSend("hello", context);
    }
//    public void send1(String i) {
//        System.out.println("====================>Sender : " + i);
//        this.rabbitTemplate.convertAndSend("hello", i);
//    }
//
//
//    public void sendu(SecurityProperties.User user) {
//        System.out.println("Sender object: " + user.toString());
//        this.rabbitTemplate.convertAndSend("user", user);
//    }
    }

