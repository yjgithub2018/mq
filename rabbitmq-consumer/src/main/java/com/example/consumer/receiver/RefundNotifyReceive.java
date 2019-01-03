package com.example.consumer.receiver;

/**
 * author zhangyj
 * date 2018/8/10 9:36
 * version 2.0
 */


import com.example.pojo.Order;
import com.example.consumer.util.LogUtil;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "notify.refund")
public class RefundNotifyReceive {
    @RabbitHandler
    public void receive(Order order) {
        LogUtil.info("notify.refund receive message: " + order);
    }
}

