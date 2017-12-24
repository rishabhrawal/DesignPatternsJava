package com.techdialogue.designpatterns.creational.factory.factorymethod;

public class Rectangle extends Polygon {

    public Rectangle(int length, int breadth){
        numberOfSides=2;
        sides.add(length);
        sides.add(breadth);
    }

    public void draw(){
        System.out.println("Drawing Rectangle with length:"+sides.get(0)+" breadth:"+sides.get(1));
    }
}
