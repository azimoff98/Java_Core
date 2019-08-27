package com.company.algorithms;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println(fib(10));
        fibonacci(10);
    }




    public static void fibonacci(int count){
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2);
        for (int i = 0; i <count ; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
        }
    }


    public static int fib(int n){
        if((n == 0) || (n == 1))
            return n;
        else
            return fib(n-1) + fib(n-2);
    }
}
