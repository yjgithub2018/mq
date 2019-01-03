package com.example.consumer.receiver;

/**
 * author zhangyj
 * date 2018/8/9 15:21
 * version 2.0
 */


import com.example.consumer.util.LogUtil;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ApiPaymentReceive {
    @RabbitHandler
    @RabbitListener(queues = "api.payment")
    public void order(String msg, Channel channel, Message message) {
        LogUtil.info("api.payment.order receive message: " + msg);
      long did =  message.getMessageProperties().getDeliveryTag();
        try {
            channel.basicAck(did,true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

