package com.rockheart.study.designpattern.observer;

public class ObserverPatternDemo {

    public static void main(String[] args){
        Subject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver("Observer1");
        Observer observer2 = new ConcreteObserver("Observer2");
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        subject.notifyObserver("hello world");
    }

}
