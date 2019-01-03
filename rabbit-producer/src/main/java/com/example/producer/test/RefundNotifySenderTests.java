package com.example.producer.test;

import com.example.pojo.Order;
import com.example.producer.sender.RefundNotifySender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;

/**
 * author zhangyj
 * date 2018/8/10 9:44
 * version 2.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RefundNotifySenderTests {
    @Autowired
    private RefundNotifySender sender;

    @Test
    public void test_sender() {
        Order order = new Order();
        order.setId(100001);
        order.setOrderId(String.valueOf(System.currentTimeMillis()));
        order.setAmount(new BigDecimal("1999.99"));
        order.setCreateTime(new Date());
        sender.sender(order);
    }
}