package com.example.producer.test;

import com.example.producer.sender.PaymentNotifySender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * author zhangyj
 * date 2018/8/9 14:47
 * version 2.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class PaymentNotifySenderTests {
    @Autowired
    private PaymentNotifySender sender;

    @Test
    public void test_sender() {
        sender.sender("支付订单号："+System.currentTimeMillis());
    }
    @Test
    public void test_sender_many2one_1() throws Exception {
        for (int i = 0; i < 20; i+=2) {
            sender.sender("支付订单号："+i);
            Thread.sleep(1000);
        }
    }

    @Test
    public void test_sender_many2one_2() throws Exception {
        for (int i = 1; i < 20; i+=2) {
            sender.sender("支付订单号："+i);
            Thread.sleep(1000);
        }
    }

    @Test
    public void test_sender_one2many() {
        for (int i = 0; i < 20; i++) {
            sender.sender("支付订单号："+i);
        }
    }
}
