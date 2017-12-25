package com.techdialogue.designpatterns.behavioural.decorator;

public abstract class Car {

    String description = "Car";

    public String getDescription(){
        return description;
    }

    public abstract double calculatePrice();
}
