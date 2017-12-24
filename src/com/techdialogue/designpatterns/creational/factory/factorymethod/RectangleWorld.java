package com.techdialogue.designpatterns.creational.factory.factorymethod;

public class RectangleWorld extends PolygonWorld{

    public Polygon createPolygon(){
        return new Rectangle(3,4);
    }
}
