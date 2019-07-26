package com.company.chapter3.time;


import java.util.Stack;

public class Main {
    public static void main(String[] args) {


        String s = "abbcdddeeff";

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length-1 ; i++) {
            int count = 1;
            char temp = arr[i];
            if(temp == ' ')
                continue;

            for (int j = i+1; j <arr.length ; j++) {

                if(temp == arr[j]){
                    arr[j] = ' ';
                    count++;
                }

            }
            System.out.println(arr[i] + ": " + count);
            arr[i] = ' ';
        }








//        for (int i = 0; i <arr.length-1; i++) {
//            int count = 1;
//            if(arr[i] != ' ')
//                temp = arr[i];
//            for (int j = i+1; j < arr.length ; j++) {
//                if(arr[i] == arr[j] && arr[i] != ' '){
//                    count++;
//                    arr[j] = ' ';
//                }
//
//            }
//            arr[i] = ' ';
//            System.out.println(temp + ": " + count);
//        }


    }
}
