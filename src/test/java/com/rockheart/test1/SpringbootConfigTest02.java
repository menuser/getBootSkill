package com.rockheart.test1;

import com.rockheart.po.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootConfigTest02 {

    @Autowired
    ApplicationContext context;

    @Test
    public void testXml(){
//        System.out.println("empService"+context.getBean("empService"));
        System.out.println("empService"+context.getBean("empService2"));
    }


}
