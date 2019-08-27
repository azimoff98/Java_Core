package com.company.algorithms;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("Dolma");
        myLinkedList.add("Dolmaaaa");
        for (int i = 0; i <myLinkedList.size() ; i++) {
            System.out.println(myLinkedList.get(i).toString());
        }
    }
}
