package com.company.chatper4.package1;

public class Class1 {

    protected String firstFieldOfFirstClass = "I am first field of first class";

    protected void firstMethodOfFirstClass(){
        System.out.println(firstFieldOfFirstClass);
    }


    public static void main(String[] args) {
        Class2 class2 = new Class2();
        System.out.println(class2);
    }
}
