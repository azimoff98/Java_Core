package com.company.algorithms;

import java.util.ArrayList;
import java.util.List;

public class SimplePieces {

    public static void main(String[] args) {
        getSimplePieces(48).forEach(System.out::println);
    }


    public static List<Integer> getSimplePieces(int i){
        int divider = 2;
        List<Integer> list = new ArrayList<>();
        while(i > 1){
            if(i % divider == 0){
                i = i / divider;
                list.add(divider);
            }else{
                divider++;
            }
        }
        return list;
    }

}
