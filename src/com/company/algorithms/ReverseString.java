package com.company.algorithms;

public class ReverseString {
    private static String reversed = "";

    public static void main(String[] args) {
        System.out.println(reverseString("Dolma"));
    }



    private static String reverseString(String s){
        if(s.length() == 1){
            return s;
        }else {
            reversed += s.charAt(s.length()-1) + reverseString(s.substring(0, s.length() -1));
            return reversed;
        }
    }
}
