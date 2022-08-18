package com.aisheessentialsjava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*
* Set data structure is very similar to the List
* But:
* Set cannot have duplicates
* Order is not guaranteed
*
* If order needs to be preserved, we can use LinkedHashSet or TreeSet
*  Set<Character> charactersSet = new LinkedHashSet<>();
*
* there is no method get() element under the particular index as the order is not guaranteed
 * */
public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Character> charactersSet = new HashSet<>();
        charactersSet.add('A');
        charactersSet.add('A');
        charactersSet.add('B');
        charactersSet.add('C');
        charactersSet.add('D');

        Iterator<Character> iterator = charactersSet.iterator();
        while(iterator.hasNext()){
            Character character = iterator.next();
            System.out.println(character);
        }

//        for(char character : charactersSet){
//            System.out.println(character);
//        }
    }
}
