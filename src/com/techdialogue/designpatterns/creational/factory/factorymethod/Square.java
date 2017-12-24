package com.techdialogue.designpatterns.creational.factory.factorymethod;

public class Square extends Polygon {

    public Square(int side){
        numberOfSides=2;
        sides.add(side);
        sides.add(side);
    }

    public void draw(){
        System.out.println("Drawing Square, with side:"+sides.get(0));
    }
}
