package com.company.algorithms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter the number of shifts: ");
        int shifts = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i <size ; i++) {
            arr[i] = new Random().nextInt(10);
        }

        System.out.println("Your Array: " + Arrays.toString(arr));

        System.out.println(Arrays.toString(leftRotation(arr, shifts)));
    }


    private static int[] leftRotation(int[] arr, int shifts){

        for (int i = 0; i < shifts; i++) {

            int first, j;
            first = arr[0];
            System.out.println("first become: " + first);
            for (j = 0; j <arr.length-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[j] = first;
        }

        return arr;
    }
}
