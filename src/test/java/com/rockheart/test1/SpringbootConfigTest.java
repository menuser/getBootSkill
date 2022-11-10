package com.rockheart.test1;

import com.rockheart.po.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.notification.RunListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Stream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootConfigTest {

    @Autowired
    Emp emp;

    @Test
    public void contextLoadTest(){
        System.out.println(emp);
    }

}
