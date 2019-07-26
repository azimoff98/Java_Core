package com.company.thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ThreadLocalRandom;

public class RandomInitRecursiveAction extends RecursiveAction {
    private static final int THRESHOLD = 10_000;
    private int[] data;
    private int start;
    private int end;
    volatile static List<String> list = Collections.synchronizedList(new ArrayList<>());

    public RandomInitRecursiveAction(int[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if (end - start <= THRESHOLD) {
      list.add(Thread.currentThread().getName()+" <-> range["+start+"..  "+end+"]");
            System.out.println(Thread.currentThread().getName()+" <-> range["+start+"..  "+end+"]");
            for (int i = start; i < end; i++) {
                data[i] = ThreadLocalRandom.current().nextInt();
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            int halfWay = ((end - start) / 2) + start;
            RandomInitRecursiveAction a1 = new RandomInitRecursiveAction(data, start, halfWay);
            a1.fork();
            RandomInitRecursiveAction a2 = new RandomInitRecursiveAction(data, halfWay, end);
            a2.compute();
            a1.join();
        }
    }

    public static void main(String[] args) {
        int[] data = new int[100_000_000];
        ForkJoinPool fjPool = new ForkJoinPool();
        RandomInitRecursiveAction action = new RandomInitRecursiveAction(data, 0, data.length);
        fjPool.invoke(action);
    System.out.println(data[100]);
    list.stream()
            .filter(s -> s != null)
            .map(s -> s.substring(0, s.indexOf("<->")))
//            .distinct()
            .forEach(System.out::println);
    }
}
