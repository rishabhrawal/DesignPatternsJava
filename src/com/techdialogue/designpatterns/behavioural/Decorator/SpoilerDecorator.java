package com.techdialogue.designpatterns.behavioural.Decorator;

public class SpoilerDecorator extends CarDecorator {

    Car car;

    public SpoilerDecorator(Car car){
        System.out.println("Attaching spoiler...");
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription()+", Spoiler";
    }

    @Override
    public double calculatePrice() {
        return car.calculatePrice() + 500;
    }
}
