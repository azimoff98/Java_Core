package com.company.algorithms;

import java.util.Arrays;

public class MyArrayList<E> {

   private int size = 0;
   private static final int DEFAULT_CAPACITY = 10;
   private transient Object[] elements;

   public MyArrayList(){
       elements = new Object[DEFAULT_CAPACITY];
   }

    public void add(E e){
       if(size == elements.length){
           ensureCapacity();
       }
       elements[size++] = e;
    }

    public Object remove(int index){
       if(index < size){
           Object object = elements[index];
           elements[index] = null;
           int tmp = index;
           while(tmp < size){
               elements[tmp] = elements[tmp+1];
               elements[tmp+1] = null;
               tmp++;
           }
           size--;
           return object;
       }else {
          throw new ArrayIndexOutOfBoundsException();
       }
    }

    public Object get(int index){
        if(index < size){
            return elements[index];
        }else{
            throw new ArrayIndexOutOfBoundsException();
        }
    }


    private void ensureCapacity(){
      elements = Arrays.copyOf(elements, size*2);
    }


}
