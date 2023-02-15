package com.rockheart.study.designpattern.factory;

/**
 * 具体产品A
 */
public class ConcreteProductA implements Product{

    @Override
    public void operation() {
        System.out.println("ConcreteProductA operation");
    }

}
