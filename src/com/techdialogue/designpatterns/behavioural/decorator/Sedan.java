package com.techdialogue.designpatterns.behavioural.Decorator;

public class Sedan extends Car {

    public Sedan(){
        description="Sedan";
    }

    @Override
    public double calculatePrice() {
        return 20000;
    }
}
