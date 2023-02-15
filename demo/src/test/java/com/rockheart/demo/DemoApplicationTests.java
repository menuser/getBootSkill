package com.rockheart.demo;

import com.rockheart.demo.thread.DynomicThreadTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private DynomicThreadTest dynomicThreadTest;

    @Test
    void contextLoads() {

    }

    @Test
    void tsetDynomicThreadTest() throws InterruptedException {
//        dynomicThreadTest.exec();
        dynomicThreadTest.exec1();
    }



}
