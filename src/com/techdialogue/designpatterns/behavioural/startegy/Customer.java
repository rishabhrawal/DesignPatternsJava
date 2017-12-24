package com.techdialogue.designpatterns.behavioural.startegy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Customer {

    private List<Double> orders;

    BillingStrategy billingStrategy;

    public Customer(){
        billingStrategy = new NormalBillingStrategy();
    }

    public Customer(BillingStrategy billingStrategy){
        this.billingStrategy = billingStrategy;
    }

    public void setBillingStrategy(BillingStrategy billingStrategy){
        this.billingStrategy=billingStrategy;
    }

    public List getOrders(){
        return orders;
    }

    public void setOrders(List orders){
        this.orders = orders;
    }

    public double getPrice(){
        double totalPrice = orders.stream().collect(Collectors.summingDouble(Double::doubleValue));
        return billingStrategy.getFinalPrice(totalPrice);
    }
}
