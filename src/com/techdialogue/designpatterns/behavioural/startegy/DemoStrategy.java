package com.techdialogue.designpatterns.behavioural.startegy;

import java.util.ArrayList;
import java.util.List;

public class DemoStrategy {

    public static void main(String[] args){
        //normal hours
        Customer c1 = new Customer();
        List<Double> o1 = new ArrayList();
        o1.add(5.0);
        o1.add(3.0);
        c1.setOrders(o1);
        System.out.println("Final Price:"+c1.getPrice());

        //start happy hours
        Customer c2 = new Customer(new HappyHoursBillingStrategy());
        List<Double> o2 = new ArrayList();
        o2.add(5.0);
        o2.add(3.0);
        c2.setOrders(o2);
        System.out.println("Final Price:"+c2.getPrice());
    }
}
