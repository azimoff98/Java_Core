package com.company.algorithms;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(123456789));
    }



    private static int reverse(int number){
        int temp = 0;
        while(number > 0){
            int b = number % 10;
            temp = (temp * 10) + b;
            number = number / 10;
        }
        return temp;
    }
}
