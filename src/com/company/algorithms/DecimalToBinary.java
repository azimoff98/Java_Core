package com.company.algorithms;

import java.util.ArrayList;
import java.util.List;

public class DecimalToBinary {
    public static void main(String[] args) {
        intToBinary(15);
    }



    private static void convertToBinary(int decimal){
        int[] arr = new int[25];
        int index = 0;
        while(decimal > 0){
            arr[index++] = decimal % 2;
            decimal = decimal / 2;
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]);
        }

    }


    private static void intToBinary(int i){
        List<Integer> list = new ArrayList<>();
        while(i > 0){
            list.add(i%2);
            i = i / 2;
        }
        list.forEach(System.out::print);
    }

}
