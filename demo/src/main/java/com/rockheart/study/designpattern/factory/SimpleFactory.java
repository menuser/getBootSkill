package com.rockheart.study.designpattern.factory;

/**
 * 简单工厂类
 */
public class SimpleFactory {

    public static Product createProduct(String type){

        if("A".equals(type)){
            return new ConcreteProductA();
        }else if("B".equals(type)){
            return new ConcreteProductB();
        }else{
            throw new IllegalArgumentException("Invalid product type.");
        }

    }

}
