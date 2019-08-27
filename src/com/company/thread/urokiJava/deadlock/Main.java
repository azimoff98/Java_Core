package com.company.thread.urokiJava.deadlock;

public class Main {

    public static void main(String[] args) {
        ResourceA resourceA = new ResourceA();
        ResourceB resourceB = new ResourceB();
        resourceA.resourceB = resourceB;
        resourceB.resourceA = resourceA;
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        myThread1.resourceA = resourceA;
        myThread2.resourceB = resourceB;
        myThread1.start();
        myThread2.start();
    }
}
