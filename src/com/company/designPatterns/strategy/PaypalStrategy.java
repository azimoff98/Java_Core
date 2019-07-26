package com.company.designPatterns.strategy;

public class PaypalStrategy implements PaymentStrategy {


    @Override
    public void pay() {
        System.out.println("Paid with paypal");
    }
}
