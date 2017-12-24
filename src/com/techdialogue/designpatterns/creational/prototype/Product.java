package com.techdialogue.designpatterns.creational.prototype;

public class Product implements  Cloneable {

    @Override
    public Product clone() throws CloneNotSupportedException{
        return (Product) super.clone();
    }

}
