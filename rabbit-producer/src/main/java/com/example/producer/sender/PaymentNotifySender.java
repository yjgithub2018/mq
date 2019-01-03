package com.example.producer.sender;

import com.example.producer.util.LogUtil;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * author zhangyj
 * date 2018/8/9 14:43
 * version 2.0
 */

@Component
public class PaymentNotifySender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void sender(String msg){
        LogUtil.info("notify.payment send message: "+msg);
        rabbitTemplate.convertAndSend("notify.payment", msg);
    }
}
