package com.company.chapter2.equality;


public class Demo {
    public static void main(String[] args) {
        int[][] myComplexArray = {{5,2,1,3}, {3,9,8,9},{5,7,12,7}};
        for(int[] mySimpleArray : myComplexArray){
            for (int i = 0; i <mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i]+"\t");
            }
            System.out.println();
        }

        int i = 12;
        double g = 42.5;
        double a = i + g;

        int x = 20;
        while(x>0){
            do{
                x -= 2;
            }while(x>5);
            x--;
            System.out.print(x+"\t");
        }

    }
}
