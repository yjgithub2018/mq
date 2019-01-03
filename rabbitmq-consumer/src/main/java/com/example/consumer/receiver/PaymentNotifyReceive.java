package com.example.consumer.receiver;

import com.example.consumer.util.LogUtil;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * author zhangyj
 * date 2018/8/9 14:55
 * version 2.0
 */

@Component
@RabbitListener(queues = "notify.payment")
public class PaymentNotifyReceive {
    @RabbitHandler
    public void receive(String msg) {
        LogUtil.info("notify.payment receive message: "+msg);
    }
}
