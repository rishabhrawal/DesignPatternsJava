package com.techdialogue.designpatterns.behavioural.decorator;

public class Hatchback extends Car {

    public Hatchback(){
        description="Hatchback";
    }

    @Override
    public double calculatePrice() {
        return 12000;
    }
}
