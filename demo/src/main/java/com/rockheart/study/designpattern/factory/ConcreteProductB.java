package com.rockheart.study.designpattern.factory;

/**
 * 具体产品B
 */
public class ConcreteProductB implements Product{

    @Override
    public void operation() {
        System.out.println("ConcreteProductB operation");
    }

}
