package com.techdialogue.designpatterns.behavioural.decorator;

public class AlloyWheelDecorator extends CarDecorator {

    Car car;

    public AlloyWheelDecorator(Car car){
        this.car=car;
        System.out.println("Adding alloys wheels...");
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", Alloys";
    }

    @Override
    public double calculatePrice() {
        return car.calculatePrice() + 600;
    }
}
