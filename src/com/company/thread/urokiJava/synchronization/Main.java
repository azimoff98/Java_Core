package com.company.thread.urokiJava.synchronization;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Resource resource = new Resource();
        resource.i = 5;
        MyThread myThread1 = new MyThread();
        myThread1.setName("one");
        MyThread myThread2 = new MyThread();
        myThread1.setResource(resource);
        myThread2.setResource(resource);
        myThread1.start();
        myThread2.start();
        myThread1.join();
        myThread2.join();
        System.out.println(resource.i);
    }
}


class MyThread extends Thread {
    Resource resource;

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run(){
        resource.changeI();
    }
}

class Resource {
    int i;

    public synchronized void changeI(){
        int i = this.i;
        i++;
        this.i = i;
    }
}