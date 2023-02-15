package com.rockheart.study.designpattern.observer;

/**
 * 具体观察者实现类
 */
public class ConcreteObserver implements Observer{

    private String name;

    public ConcreteObserver(String name){
        this.name = name;
    }

    public void update(String message){
        System.out.println(name + "received message: "+ message);
    }

}
