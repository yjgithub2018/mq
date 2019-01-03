package com.example.rabbit;

/**
 * author zhangyj
 * date 2018/8/8 10:14
 * version 2.0
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig1 {
    private static final Logger log = LoggerFactory.getLogger(RabbitConfig1.class);

    @Bean
    public Queue helloQuque() {
        return new Queue("hello");
    }

    @Bean
    public Queue userLoginQuque() {
        String create_queue = "userlogin_queue_test";
        log.info("建立队列queue：" + create_queue);
        return new Queue(create_queue);
    }
}