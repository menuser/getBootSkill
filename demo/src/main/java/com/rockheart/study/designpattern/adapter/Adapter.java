package com.rockheart.study.designpattern.adapter;

/**
 * 适配器
 */
public class Adapter implements target{

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }

}
