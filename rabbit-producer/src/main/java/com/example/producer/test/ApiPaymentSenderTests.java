package com.example.producer.test;

import com.example.producer.sender.ApiPaymentSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * author zhangyj
 * date 2018/8/9 15:58
 * version 2.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiPaymentSenderTests {
    @Autowired
    private ApiPaymentSender sender;
    /**
    *@Author zhangyj
    *@Description 
    *@Date 16:062018/8/15
    *@Param 
    *@return 
    */
    @Test
    public void test_order() {
        sender.order("订单管理！");
    }

    @Test
    public void test_orderQuery() {
        sender.orderQuery("查询订单信息！");
    }

    @Test
    public void test_orderDetailQuery() {
        sender.orderDetailQuery("查询订单详情信息！");
    }


}
