package com.company.chapter3.equality;


import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println(fibonacci(15));

    }



    public static boolean isPolindromeString(String s){
        String a = "";
        int length = s.length();
        for (int i = length - 1; i >=0 ; i--) {
            a = a + s.charAt(i);
        }
        if(s.equals(a))
            return true;
        return false;
    }


    public static boolean isPolindromeNumber(int i){
        int b;
        int sum = 0;
        int temp = i;
        while(i > 0){
            b = i % 10;
            sum = (sum * 10) + b;
            i = i / 10;
        }
        if(temp == sum)
            return true;

        return false;
    }


    public static int fibonacci(int n){
        if(n <=1 )
            return n;
        return fibonacci(n-1) + fibonacci(n - 2);
    }

    public static void fibonacci2(int count){
        int n1 = 0, n2 = 1, n3;
        for (int i = 0; i <count; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }

    public static int maxSubArraySum(int a[], int size){
        int max = a[0];
        int currentMax = a[0];
        for (int i = 1; i <size ; i++) {
            currentMax = Math.max(a[i], currentMax + a[i]);
            max = Math.max(max, currentMax);
        }
        return max;
    }

    public static int[] bubbleSort(int[] arr){
        int temp;
        int count = 0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    count++;
                }
            }
        }
        System.out.println(count);
        return arr;
    }

    public static int[] bubbleSort1(int[] arr){
        int n = arr.length;
        int count = 0;
        for (int i = 0; i <n-1 ; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                }
            }
        }
        System.out.println(count);
        return arr;
    }






    public static void fibonacci3(int count){
        int n1 = 0, n2 = 1, n3;
        for (int i = 0; i <count; i++) {
            n3 = n1+n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }

}
