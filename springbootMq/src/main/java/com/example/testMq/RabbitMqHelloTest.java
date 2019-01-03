package com.example.testMq;


import com.example.DemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * author zhangyj
 * date 2018/8/8 11:27
 * version 2.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class RabbitMqHelloTest {
    @Autowired
    private AmqpTemplate rabbitTemplate;
    @Autowired
    private HelloSender helloSender;

    @Test
    public void hello() throws Exception {
        helloSender.send();
    }
//    @Test
//    public void oneToMany() throws Exception {
//        for (int i=0;i<10;i++){
//            helloSender.send1(i+"");
//        }
//    }
//    @Test
//    public void sendu() throws Exception {
//        SecurityProperties.User user = new SecurityProperties.User();
//        user.setName("ffddd");
//        user.setPassword("12345");
//        helloSender.sendu(user);
//    }
    @Test
    public void topic() throws Exception {
        rabbitTemplate.convertAndSend("exchange","topic.messagett","topic 模式测试 rabbitMq");
    }
}

