package com.techdialogue.designpatterns.creational.builder;

public class DemoBuilder {

    public static void main(String[] args){
        Car.CarBuilder builder = Car.getCarBuilder();
        Car car = builder.setReg("ABCX").setColour("Orange").build();
        System.out.println(car);
    }
}
