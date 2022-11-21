package com.rockheart.demo.test;

import com.rockheart.demo.common.SIze;
import com.sun.glass.ui.Size;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

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


    }

}
