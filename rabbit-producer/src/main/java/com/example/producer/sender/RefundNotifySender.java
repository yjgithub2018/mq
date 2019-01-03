package com.example.producer.sender;

/**
 * author zhangyj
 * date 2018/8/10 9:40
 * version 2.0
 */

import com.example.pojo.Order;
import com.example.producer.util.LogUtil;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RefundNotifySender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void sender(Order order) {
        LogUtil.info("notify.refund send message: " + order);
        rabbitTemplate.convertAndSend("notify.refund", order);
    }
}
