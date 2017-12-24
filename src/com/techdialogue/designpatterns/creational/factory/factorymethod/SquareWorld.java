package com.techdialogue.designpatterns.creational.factory.factorymethod;

public class SquareWorld extends PolygonWorld{

    public Polygon createPolygon(){
        return new Square(2);
    }
}
