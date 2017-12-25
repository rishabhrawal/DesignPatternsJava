package com.techdialogue.designpatterns.behavioural.Decorator;

public abstract class Car {

    String description = "Car";

    public String getDescription(){
        return description;
    }

    public abstract double calculatePrice();
}
