package com.rockheart.demo.test;

import com.rockheart.demo.common.SIze;
import com.rockheart.demo.po.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@FeignClient
public class TestBoot01 {

    public static void main(String[] args) {
        System.out.println(Character.isValidCodePoint('Y'));
        System.out.println(Character.isJavaIdentifierStart('A'));
        System.out.println((byte)300);
        System.out.println((long)300);

//        String testStr = "a=123&b=1234&c=12345";
//        Arrays.asList(testStr.split("&")).stream()
//                .map(w -> Arrays.stream(w.split("=")))
//                .forEach(System.out::println);
//
//        SIze s = SIze.MEDIUM;
//        System.out.println(s);
//
//        LocalDate currDate = LocalDate.now();
//        System.out.println(currDate.toString());


        List<User> userList = new ArrayList<User>();
        userList.add(new User("小梦", 1));
        userList.add(new User("小李", 2));
        userList.add(new User("小张", 1));


        //java流式计算练习
        List<String> strList = userList.stream()
                .flatMap(user -> Arrays.stream(user.toString().split(" ")))
                .collect(Collectors.toList());

        //一般方法遍历集合
        strList.stream().forEach((s) -> {
            System.out.println(s);
        });

        //Java流式计算数据过滤
        List<User> newUserList = userList.stream()
                .filter(user -> user.getGender()<= 1)
                .collect(Collectors.toList());

        //java流式计算遍历集合
        newUserList.stream().forEach(user -> System.out.println(user));









    }


    @GetMapping("getUserInfo")
    @ResponseBody
    public String getUserInfo(@SpringQueryMap String userId){
        System.out.println(userId);
        return "user1";
    }

}
