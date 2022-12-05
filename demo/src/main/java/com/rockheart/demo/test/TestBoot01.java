package com.rockheart.demo.test;

import com.rockheart.demo.common.SIze;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Arrays;

@RestController
@FeignClient
public class TestBoot01 {

    public static void main(String[] args) {
        System.out.println(Character.isValidCodePoint('Y'));
        System.out.println(Character.isJavaIdentifierStart('A'));
        System.out.println((byte)300);
        System.out.println((long)300);

        String testStr = "a=123&b=1234&c=12345";
        Arrays.asList(testStr.split("&")).stream()
                .map(w -> Arrays.stream(w.split("=")))
                .forEach(System.out::println);

        SIze s = SIze.MEDIUM;
        System.out.println(s);

        LocalDate currDate = LocalDate.now();
        System.out.println(currDate.toString());

    }


    @GetMapping("getUserInfo")
    @ResponseBody
    public String getUserInfo(@SpringQueryMap String userId){
        System.out.println(userId);
        return "user1";
    }

}
