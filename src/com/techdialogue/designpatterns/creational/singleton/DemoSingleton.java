package com.techdialogue.designpatterns.creational.singleton;

/**
 * this demo works in a single threaded environment but the
 * pattern works in multithreaded environment as well
 */
public class DemoSingleton {

    public static void main(String [] args){
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

        //second object also points to the same object
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2);
    }
}
