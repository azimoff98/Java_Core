package com.company.thread.urokiJava.deadlock;

public class ResourceB {
    ResourceA resourceA;

    public synchronized int getI(){
        return resourceA.returnI();
    }

    public synchronized int returnI(){
        return 1;
    }
}
