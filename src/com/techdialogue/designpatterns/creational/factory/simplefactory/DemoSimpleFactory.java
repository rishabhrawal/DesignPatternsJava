package com.techdialogue.designpatterns.creational.factory.simplefactory;

public class DemoSimpleFactory {

    public static void main(String[] args){

        Polygon polygon1 = PolygonFactory.getPolygon("triangle");
        System.out.println(polygon1.getType());

        Polygon polygon2 = PolygonFactory.getPolygon("square");
        System.out.println(polygon2.getType());

        Polygon polygon3 = PolygonFactory.getPolygon("rectangle");
        System.out.println(polygon3.getType());
    }
}
