package com.company.thread.urokiJava.deadlock;

public class MyThread1 extends Thread {
    ResourceA resourceA;

    @Override
    public void run() {
        System.out.println(resourceA.getI());
    }
}
