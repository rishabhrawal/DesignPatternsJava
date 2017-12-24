package com.techdialogue.designpatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputReader implements Observable {

    List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver(String s) {
        for(Observer o: observers){
            o.update(s);
        }
    }

    Scanner in = new Scanner(System.in);

    public void readInput(){
        System.out.println("Please enter values"+"\ntype stop to exit!");
        String s=null;
        while(!"stop".equalsIgnoreCase(s)){
            s=in.next();
            notifyObserver(s);
        }
    }
}
