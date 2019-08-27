package com.company.algorithms;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(123456789));
        System.out.println(isPolyndrome(456655));
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

    private static boolean isPolyndrome(int n){
        int sum = 0;
        int keeper = n;
        int b;
        while(n > 0){
            b = n % 10;
            sum = (sum * 10) + b;
            n = n / 10;
        }
        if(sum == keeper)
            return true;

        return false;

    }
}
