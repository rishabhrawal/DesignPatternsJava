package com.techdialogue.designpatterns.behavioural.observer;

public interface Observable {

    public abstract void attach(Observer o);
    public abstract void detach(Observer o);
    public abstract void notifyObserver(String s);
}
