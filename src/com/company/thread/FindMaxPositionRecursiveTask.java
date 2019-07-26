package com.company.thread;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class FindMaxPositionRecursiveTask extends RecursiveTask<Integer> {
    private static final int THRESHOLD = 10_000;
    private int[] data;
    private int start;
    private int end;

    public FindMaxPositionRecursiveTask(int[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {

        if (end - start <= THRESHOLD) {
            int position = 0;

            for (int i = start; i < end; i++) {
                if (data[i] > data[position]) {
                    position = i;
                }
            }
            return position;
        } else {
            int halfWay = ((end - start) / 2) + start;
            FindMaxPositionRecursiveTask t1 = new FindMaxPositionRecursiveTask(data, start, halfWay);
            t1.fork();
            FindMaxPositionRecursiveTask t2 = new FindMaxPositionRecursiveTask(data, halfWay, end);
            int position2 = t2.compute();
            int position1 = t1.join();

            if (data[position1] > data[position2]) {
                return position1;
            } else if (data[position1] < data[position2]) {
                return position2;
            } else {
                return position1 < position2 ? position1 : position2;
            }
        }
    }

    public static void main(String[] args) {
        double start = System.currentTimeMillis();
        int[] data = new int[100_000_000];
        ForkJoinPool fjPool = new ForkJoinPool();
        RandomInitRecursiveAction action = new RandomInitRecursiveAction(data, 0, data.length);
        fjPool.invoke(action);

        FindMaxPositionRecursiveTask task = new FindMaxPositionRecursiveTask(data, 0, data.length);
        Integer position = fjPool.invoke(task);
        System.out.println("Position: "+position+", value: "+data[position]);

        System.out.println("Completed: " + (System.currentTimeMillis()-start)/1000.);
    }
}
