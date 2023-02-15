package com.rockheart.study.designpattern.decorator;

/**
 * 测试
 */
public class TestDecorator {

    public static void main(String[] args) {

        //创建原始对象
        Shape circle = new Circle();

        //创建装饰器对象
        Shape redCircle = new RedShapeDecorator(new Circle());

        //调用方法
        circle.draw();
        redCircle.draw();

    }

}
