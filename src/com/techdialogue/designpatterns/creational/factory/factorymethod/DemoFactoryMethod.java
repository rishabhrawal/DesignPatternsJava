package com.techdialogue.designpatterns.creational.factory.factorymethod;

public class DemoFactoryMethod {

    public static void main(String[] args) {
        PolygonWorld p = new RectangleWorld();
        p.draw();

        PolygonWorld p2= new SquareWorld();
        p2.draw();
    }

}
