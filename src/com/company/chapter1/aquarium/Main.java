package com.company.chapter1.aquarium;

// A -> import com.company.chapter1.aquarium.* compiles;




// B -> does not compile
import com.company.chapter1.aquarium.Water;
import com.company.chapter1.aquarium.jellies.*;


// C -> compiles
/*
import com.company.chapter1.aquarium.*;
import com.company.chapter1.aquarium.jellies.Water;
*/

/*
// D -> does not compile
import com.company.chapter1.aquarium.*;
import com.company.chapter1.aquarium.jellies.*;
*/
/*
// E -> Does not compile
import com.company.chapter1.aquarium.Water;
import com.company.chapter1.aquarium.jellies.Water;
*/


public class Main {

    public static void main(String... args) {

        Object obj = new String("object");


    }
}
