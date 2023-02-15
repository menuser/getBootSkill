package com.rockheart.study.designpattern.observer;

/**
 * 被观察者接口
 */
public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver(String message);

}
