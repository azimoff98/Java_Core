package com.company.chapter1.subChapter1;

import java.util.*;
import java.sql.*;


public class Animal{

    public Animal(){
        System.out.println("this is a constructor ");
        {
            System.out.println("this  is a instance initializer in constructor");
        }
    }

    {
        System.out.println("this is a instance initializer");
    }

    static {
        System.out.println("this is a static instance initializer");
    }
}


