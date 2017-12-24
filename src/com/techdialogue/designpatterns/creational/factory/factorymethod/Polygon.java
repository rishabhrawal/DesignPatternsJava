package com.techdialogue.designpatterns.creational.factory.factorymethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Polygon {

    int numberOfSides;
    List<Integer> sides = new ArrayList();

    public abstract void  draw();

}
