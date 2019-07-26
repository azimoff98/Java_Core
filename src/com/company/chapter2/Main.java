package com.company.chapter2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) {

    }

    static class NameList{
        private List list = Collections.synchronizedList(new ArrayList<>());

    }
}
