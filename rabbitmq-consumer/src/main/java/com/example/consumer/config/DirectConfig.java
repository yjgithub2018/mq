package com.example.consumer.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * author zhangyj
 * date 2018/8/9 14:52
 * version 2.0
 */

@Configuration
public class DirectConfig {
    @Bean
    public Queue paymentNotifyQueue() {
        return new Queue("notify.payment");
    }
    @Bean
    public Queue refundNotifyQueue() {
        return new Queue("notify.refund");
    }

    @Bean
    public Queue queryOrderQueue() {
        return new Queue("query.order");
    }
}
