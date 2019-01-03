package com.example.consumer.receiver;

/**
 * author zhangyj
 * date 2018/8/9 18:32
 * version 2.0
 */

import com.example.consumer.util.LogUtil;
import org.springframework.stereotype.Component;


        import org.springframework.amqp.rabbit.annotation.RabbitHandler;
        import org.springframework.amqp.rabbit.annotation.RabbitListener;
        import org.springframework.stereotype.Component;


@Component
public class ApiReportReceive {
    @RabbitHandler
    @RabbitListener(queues = "api.report.payment")
    public void payment(String msg) {
        LogUtil.info("api.report.payment receive message: "+msg);
    }

    @RabbitHandler
    @RabbitListener(queues = "api.report.refund")
    public void refund(String msg) {
        LogUtil.info("api.report.refund receive message: "+msg);
    }
}

