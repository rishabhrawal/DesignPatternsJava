package com.techdialogue.designpatterns.behavioural.startegy;

public class NormalBillingStrategy extends BillingStrategy {

    @Override
    double getFinalPrice(double price) {
        return price;
    }
}
