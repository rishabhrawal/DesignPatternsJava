package com.techdialogue.designpatterns.behavioural.decorator;

public class ColorDecorator extends  CarDecorator {

    Car car;

    public ColorDecorator(Car car){
        System.out.println("Painting with custom color...");
        this.car=car;
    }

    @Override
    public String getDescription() {
        return car.getDescription()+", Custom paint";
    }

    @Override
    public double calculatePrice() {
        return car.calculatePrice() + 800;
    }
}
