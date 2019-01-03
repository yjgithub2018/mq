package com.example.consumer.util;

/**
 * author zhangyj
 * date 2018/8/9 14:44
 * version 2.0
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogUtil {
    private static Logger logger = LoggerFactory.getLogger(LogUtil.class);

    public static void debug(String msg){
        logger.debug(msg);
    }

    public static void info(String msg){
        logger.info(msg);
    }

    public static void error(String msg){
        logger.error(msg);
    }

}
