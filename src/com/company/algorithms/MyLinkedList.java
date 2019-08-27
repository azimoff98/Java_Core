package com.company.algorithms;

public class MyLinkedList<E> {
    private static int counter;
    private Node head;

    public MyLinkedList() {
    }

    //appends the specified element to the end fo this list
    public void add(E e){

        //Initialize node only in case of 1st element
        if(head == null){
            head = new Node(e);
        }

        Node temp = new Node(e);
        Node current = head;

        // Let's check for NPE before iterate over current
        if(current != null){

            // starting at the head node, crawl to the end of the list and then add element after last node
            while(current.getNext() != null){
                current = current.getNext();
            }

            //the last node's "next" reference set to our new node
            current.setNext(temp);
        }
        incrementCounter();
    }

    //Inserts specified element at specified index
    public void add(E e, int index){
        Node temp = new Node(e);
        Node current = head;
        
        if(current != null){
            // crawl to the requested index or the last element in the list, whichever comes first
            for (int i = 0; i < index && current.getNext() != null ; i++) {
                current = current.getNext();
            }
        }
        // set the new node's next-node reference to this node's next-node reference
        temp.setNext(current.getNext());
        // now set this node's next-node reference to the new node
        current.setNext(temp);

        incrementCounter();

    }

    public Object get(int index){
        if(index < 0)
            throw new ArrayIndexOutOfBoundsException();
        Node current = null;
        if(head != null){
            current = head.getNext();
            for (int i = 0; i <index ; i++) {
                if(current.getNext() == null)
                    throw new ArrayIndexOutOfBoundsException();

                current = current.getNext();
            }
        }
        return current;
    }

    public boolean remove(int index){

        if(index < 0 || index > size())
            throw new ArrayIndexOutOfBoundsException();

        Node current = head;

        if(head != null){
            for (int i = 0; i < index ; i++) {
                if(current.getNext() == null)
                    return false;

                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
            decrementCounter();
            return true;
        }
        return false;
    }

    public int size(){
        return getCounter();
    }

    private static int getCounter(){
        return counter;
    }
    private static void incrementCounter(){
        counter++;
    }
    private static void decrementCounter(){
        counter--;
    }

    public String toString(){
        String output = "";
        if(head != null){
            Node current = head.getNext();
            while(current != null){
                output += current.getData().toString();
                current = current.getNext();
            }
        }
        return output;
    }



    private class Node{
        //Reference to the next Node in the chain, or null if there is no one
        Node next;
        // data carried by this node.
        Object data;

        // Node constructor
        public Node(Object data) {
            next = null;
            this.data = data;
        }
        // Another Node constructor if we want to specify the node to print to.
        public Node(Object data, Node next){
            this.next = next;
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }
    }
}
