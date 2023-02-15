package com.rockheart.study.designpattern.singleton;

public class Singleton{

    //饿汉式
//    private static Singleton instance = new Singleton();
//
//    private Singleton(){}
//
//    public static Singleton getInstance(){
//        return instance;
//    }

    //懒汉式
//    private static Singleton instance;
//
//    private Singleton(){}
//
//    public static Singleton getInstance(){
//        if(instance == null){
//            instance = new Singleton();
//        }
//        return instance;
//    }

    //静态内部类
//    private Singleton(){}
//
//    public static Singleton getInstance(){
//        return SingletonHolder.INSTANCE;
//    }
//
//    private static class SingletonHolder {
//        private static final Singleton INSTANCE = new Singleton();
//    }

    //double check
//    private static volatile Singleton instance;
//
//    private Singleton(){}
//
//    public static Singleton getInstance(){
//        if (instance == null){
//            synchronized(Singleton.class){
//                instance = new Singleton();
//            }
//        }
//        return instance;
//    }


    //枚举
    //。。。
    public enum SingletonEnum{

        INSTANCE;

        public void doSomething(){
            //实现单例对象的功能
        }

    }


}
