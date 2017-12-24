package com.techdialogue.designpatterns.behavioural.startegy;

public abstract class BillingStrategy {
    abstract double getFinalPrice(final double price);
}
