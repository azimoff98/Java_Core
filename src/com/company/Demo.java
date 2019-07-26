package com.company;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String passportNumber = sc.nextLine().trim().replaceAll("\\s+", "").toUpperCase();
        if(passportNumber.length() > 12){
            throw new RuntimeException("Passport number is to long...");
        }
        System.out.println(passportNumber);

    }
}
