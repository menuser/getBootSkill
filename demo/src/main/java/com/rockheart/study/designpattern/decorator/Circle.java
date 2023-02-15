package com.rockheart.study.designpattern.decorator;

/**
 * 实现接口
 */
public class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }

}
