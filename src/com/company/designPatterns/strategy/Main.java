package com.company.designPatterns.strategy;

public class Main {

    public static void main(String[] args) {
        PaymentService ps = new PaymentService();
        ps.pay(new PaypalStrategy());
    }
}
