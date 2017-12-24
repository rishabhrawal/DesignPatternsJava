package com.techdialogue.designpatterns.creational.prototype;

public class ProductPrototype {

    private static Product product = new Product();

    public static Product getProduct(){
        try {
            return product.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
