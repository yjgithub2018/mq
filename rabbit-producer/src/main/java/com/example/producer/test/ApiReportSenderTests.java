package com.example.producer.test;

import com.example.producer.sender.ApiReportSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * author zhangyj
 * date 2018/8/10 9:21
 * version 2.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiReportSenderTests {
    @Autowired
    private ApiReportSender sender;

    @Test
    public void test_generateReports() {
        sender.generateReports("开始生成报表！");
    }
}
