package com.techdialogue.designpatterns.creational.singleton;

/**
 * Double checked locking for lazy loading in multithreaded environment
 */
public class Singleton {

    //volatile so that all the threads see same value
    private static volatile Singleton instance;

    //private constructor to stop external instantiation
    private Singleton(){
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
