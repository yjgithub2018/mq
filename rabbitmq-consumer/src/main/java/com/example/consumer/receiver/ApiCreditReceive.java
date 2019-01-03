package com.example.consumer.receiver;

/**
 * author zhangyj
 * date 2018/8/9 16:18
 * version 2.0
 */


import com.example.consumer.util.LogUtil;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


@Component
public class ApiCreditReceive {
    @RabbitHandler
    @RabbitListener(queues = "credit.bank")
    public void creditBank(String msg) {
        LogUtil.info("credit.bank receive message: " + msg);
    }

    @RabbitHandler
    @RabbitListener(queues = "credit.finance")
    public void creditFinance(String msg) {
        LogUtil.info("credit.finance receive message: " + msg);
    }
}

