package com.example.user;

import com.sun.org.apache.regexp.internal.RE;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.AuthenticationException;
import java.util.HashMap;
import java.util.Map;

/**
 * author zhangyj
 * date 2018/8/8 10:16
 * version 2.0
 */

@RestController
public class LoginController {
    private final org.slf4j.Logger logger = LoggerFactory.getLogger(LoginController.class);

    //在引入Spring-AMQP后可以直接使用AmqpTemplate
    @Autowired
    private AmqpTemplate rabbitTemplate;

    @PostMapping("/login")
    @ResponseBody
    RE ajaxLogin(String username, String password) {
        try {
            //登录的逻辑代码
//            ......
//            //使用已封装好的convertAndSend(String exchange , String routingKey , Object message)使用特定的routingKey发送消息到指定的exchange
            Map json = new HashMap<>();
            json.put("username", username);
            json.put("password", password);
            rabbitTemplate.convertAndSend("exchange_login", "login_key", json.toString());
//            logger.info("登录成功，rabbitMQ发送消息，内容：" + json);
//            ......
//            return RE.ok();
        } catch (Exception e) {
//            return RE.error("用户或密码错误");
        }
        return null;
    }

    @GetMapping("/logout")
    String logout() {
//        ShiroUtils.logout();
        return "redirect:/login";
    }

    @Test
    public void testUser(){
        Map json = new HashMap<>();
        json.put("username", 123);
        json.put("password", 345);
        rabbitTemplate.convertAndSend("exchange_login", "login_key", json.toString());
    }
}

