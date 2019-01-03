package com.example.producer.sender;

/**
 * author zhangyj
 * date 2018/8/9 15:22
 * version 2.0
 */


import com.example.producer.util.LogUtil;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ApiCoreSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void user(String msg) {
        LogUtil.info("api.core.user send message: " + msg);
        rabbitTemplate.convertAndSend("coreExchange", "api.core.user", msg);
    }

    public void userQuery(String msg) {
        LogUtil.info("api.core.user.query send message: " + msg);
        rabbitTemplate.convertAndSend("coreExchange", "api.core.user.query", msg);
    }
}

