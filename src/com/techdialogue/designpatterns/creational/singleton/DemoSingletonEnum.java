package com.techdialogue.designpatterns.creational.singleton;

public class DemoSingletonEnum {

    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.INSTANCE;
        System.out.println(singleton +":"+singleton.getValue());
        singleton.setValue(1);
        System.out.println(singleton +":"+singleton.getValue());

        //new instance has same value
        SingletonEnum singleton2 = SingletonEnum.INSTANCE;
        System.out.println(singleton2 +":"+singleton2.getValue());


    }
}
