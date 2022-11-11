package com.rockheart.test1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootLogTest01 {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoads(){

        //跟踪运行信息
        logger.trace("这是trace日志信息！");
        //调试信息
        logger.debug("这是debug日志信息！");
        //自定义信息
        logger.info("这是info日志信息！");
        //警告信息
        logger.warn("这是warn日志信息！");
        //错误信息
        logger.error("这是error日志信息！");

    }

}
