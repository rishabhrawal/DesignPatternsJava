package com.techdialogue.designpatterns.behavioural.Decorator;

public class DemoDecorator {

    public static void main(String[] args){

        //before decoration
        Car hatchback = new Hatchback();
        System.out.println("Description: "+hatchback.getDescription());
        System.out.println("Price: "+hatchback.calculatePrice());

        System.out.println("**************Decorating hatchback****************");
        hatchback = new AlloyWheelDecorator(hatchback);
        System.out.println("Description: "+hatchback.getDescription());
        System.out.println("Price: "+hatchback.calculatePrice());

        System.out.println("=========================================");
        Car sedan = new Sedan();
        System.out.println("Description: "+sedan.getDescription());
        System.out.println("Price: "+sedan.calculatePrice());

        System.out.println("**************Decorating Sedan****************");
        sedan = new ColorDecorator(sedan);
        sedan = new SpoilerDecorator(sedan);
        sedan = new AlloyWheelDecorator(sedan);
        System.out.println("Description: "+sedan.getDescription());
        System.out.println("Price: "+sedan.calculatePrice());


    }
}
