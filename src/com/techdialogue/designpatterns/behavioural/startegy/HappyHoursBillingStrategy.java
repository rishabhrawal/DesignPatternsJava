package com.techdialogue.designpatterns.behavioural.startegy;

public class HappyHoursBillingStrategy extends BillingStrategy {

    public static final double DISCOUNT = 50.0/100;

    @Override
    double getFinalPrice(double price) {
        return price*DISCOUNT;
    }
}
