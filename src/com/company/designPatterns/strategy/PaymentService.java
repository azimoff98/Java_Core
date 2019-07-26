package com.company.designPatterns.strategy;

public class PaymentService {


    public void pay(PaymentStrategy paymentStrategy){
        paymentStrategy.pay();
        System.out.println("aa");
    }
}
