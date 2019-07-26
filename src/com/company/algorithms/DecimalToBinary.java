package com.company.algorithms;

public class DecimalToBinary {
    public static void main(String[] args) {
        convertToBinary(123564);
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

}
