package com.techdialogue.designpatterns.creational.factory.simplefactory;

public class PolygonFactory {

    Polygon polygon;

    public static Polygon getPolygon(String type){
        if("triangle".equalsIgnoreCase(type)){
            return new Triangle();
        }else if("square".equalsIgnoreCase(type)){
            return new Square();
        }else if("rectangle".equalsIgnoreCase(type)){
            return new Rectangle();
        }else{
            return null;
        }
    }

}
