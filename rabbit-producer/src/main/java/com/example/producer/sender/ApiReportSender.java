package com.example.producer.sender;

import com.example.producer.util.LogUtil;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * author zhangyj
 * date 2018/8/10 9:20
 * version 2.0
 */

@Component
public class ApiReportSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void generateReports(String msg){
        LogUtil.info("api.generate.reports send message: "+msg);
        rabbitTemplate.convertAndSend("reportExchange", "api.generate.reports", msg);
    }
}
