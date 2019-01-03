package com.example.producer.sender;

/**
 * author zhangyj
 * date 2018/8/9 15:59
 * version 2.0
 */

import com.example.producer.util.LogUtil;
import org.springframework.stereotype.Component;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ApiPaymentSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void order(String msg) {
        LogUtil.info("api.payment.order send message: " + msg);
        rabbitTemplate.convertAndSend("paymentExchange", "api.payment.order", msg);
    }

    public void orderQuery(String msg) {
        LogUtil.info("api.payment.order.query send message: " + msg);
        rabbitTemplate.convertAndSend("paymentExchange", "api.payment.order.query", msg);
    }

    public void orderDetailQuery(String msg) {
        LogUtil.info("api.payment.order.detail.query send message: " + msg);
        rabbitTemplate.convertAndSend("paymentExchange", "api.payment.order.detail.query", msg);
    }
}

