package com.example.user;

/**
 * author zhangyj
 * date 2018/8/8 10:21
 * version 2.0
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;


@Component
public class LoginRecevier {
    private static final Logger log = LoggerFactory.getLogger(LoginRecevier.class);
    //自己业务的逻辑
    @RabbitHandler
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = "userlogin_queue_test", durable = "true"),
            exchange = @Exchange(value = "exchange_login", type = "topic", durable = "true"),
            key = "login_key")
    )
    void receiveMessage(String message) throws Exception {
        try {
            log.info("RabbitListener获得---1---队列信息:" + message);
        } catch (Exception e) {
            log.info("获取异常", e);
        }
    }
}
