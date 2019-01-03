package com.example.testMq.topic;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * author zhangyj
 * date 2018/8/8 17:21
 * version 2.0
 */
@Component
public class TopicReceiver {
    @RabbitListener(queues="topic.messagett")    //监听器监听指定的Queue
    public void process1(String str) {
        System.out.println("message1:"+str);
    }
    @RabbitListener(queues="topic.messages")    //监听器监听指定的Queue
    public void process2(String str) {
        System.out.println("messages2:"+str);
    }
    @RabbitListener(queues="topic.message")    //监听器监听指定的Queue
    public void process3(String str) {
        System.out.println("messages3:"+str);
    }
}
