package com.company.designPatterns.strategy;

public class CreditCardStrategy implements PaymentStrategy {


    @Override
    public void pay() {
        System.out.println("Paid with credit card");
    }
}
