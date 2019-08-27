package com.company.algorithms;

public class ReverseString {
    private static String reversed = "";

    public static void main(String[] args) {
        System.out.println(reverseStringIteration("Dolma"));
        System.out.println(isPolindrome("ANA"));
    }



    private static String reverseStringIteration(String s){
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length()-1; i >= 0 ; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }


    private static String reverseString(String s){
        if(s.length() == 1){
            return s;
        }else {
            reversed += s.charAt(s.length()-1) + reverseString(s.substring(0, s.length() -1));
            return reversed;
        }
    }

    private static boolean isPolindrome(String s){
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length()-1; i >= 0 ; i--) {
            reversed.append(s.charAt(i));
        }
        if(s.equals(reversed.toString()))
            return true;

        return false;
    }
}
