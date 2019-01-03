package com.example.producer.test;

import com.example.producer.sender.ApiCoreSender;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * author zhangyj
 * date 2018/8/9 15:57
 * version 2.0
 */

public class ApiCoreSenderTests{
    @Autowired
    private ApiCoreSender sender;

    @Test
    public void test_user() {
        sender.user("用户管理！");
    }

    @Test
    public void test_userQuery() {
        sender.userQuery("查询用户信息！");
    }
}
