package com.techdialogue.designpatterns.creational.prototype;

public class DemoPrototype {

    public static void main(String[] args){

        Product p1 = ProductPrototype.getProduct();
        System.out.println(p1);

        Product p2 = ProductPrototype.getProduct();
        System.out.println(p2);
    }
}
