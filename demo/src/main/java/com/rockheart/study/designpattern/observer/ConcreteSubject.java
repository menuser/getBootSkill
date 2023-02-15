package com.rockheart.study.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体被观察者实现类
 */
public class ConcreteSubject implements Subject{

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer){
        observers.add(observer);
    }

    @Override
    public void notifyObserver(String message){
        for (Observer obs : observers ){
            obs.update(message);
        }
    }

}
