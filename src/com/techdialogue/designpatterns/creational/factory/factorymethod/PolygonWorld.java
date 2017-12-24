package com.techdialogue.designpatterns.creational.factory.factorymethod;

public abstract class PolygonWorld {

    Polygon p1;

    public PolygonWorld(){
        p1 = createPolygon();
    }


    public void draw(){
         p1.draw();
    }

    //instantiation of the object being used is delegated to the the child
    public abstract Polygon createPolygon();
}
