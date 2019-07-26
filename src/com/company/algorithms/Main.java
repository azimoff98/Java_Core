package com.company.algorithms;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();

        for (int i = 0; i <15 ; i++) {
            myArrayList.add(i);
        }
        for (int i = 0; i <15 ; i++) {
            System.out.println(myArrayList.get(i));
        }
    }
}
