package com.example.consumer.receiver;

/**
 * author zhangyj
 * date 2018/8/9 15:20
 * version 2.0
 */

import com.example.consumer.util.LogUtil;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


@Component
public class ApiCoreReceive {
    @RabbitHandler
    @RabbitListener(queues = "api.core")
    public void user(String msg) {
        LogUtil.info("api.core receive message: " + msg);
    }
}

