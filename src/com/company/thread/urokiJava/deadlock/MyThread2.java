package com.company.thread.urokiJava.deadlock;

public class MyThread2 extends Thread {
    ResourceB resourceB;

    @Override
    public void run() {
        System.out.println(resourceB.getI());
    }
}
