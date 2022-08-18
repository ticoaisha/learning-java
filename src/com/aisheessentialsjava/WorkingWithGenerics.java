package com.aisheessentialsjava;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class WorkingWithGenerics {
    public static void main(String[] args) {
        /*
        * When we program, we should be enforcing data type that our data structure will support
        * That is why we have Generics
        *
        * we can't have primitives as data type
        * instead we have Objects for that primitives as data type
        *
        * We can specify data type on the right side as well, but it is redundant
        * List<Integer> numbers = new ArrayList<Integer>();

         *
        *
        * */
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(100);
        numbers.add(9000);
//        numbers.add("Hello");
//        numbers.add(new Point(10,10));
//        numbers.add('A');

        numbers.remove(1); //want to remove item under index 1
        numbers.add(0, -1);

        System.out.println(numbers);
        System.out.println(numbers.contains(9000));

//        numbers.clear();

        System.out.println(numbers.isEmpty());
        System.out.println(numbers.size());
        /*
        * Looping through the List
        * */

        //now we can have int instead of the Object because we specified that data type for our List
        for(int number : numbers){
            System.out.println(number);
        }
//
//        System.out.println();
//        numbers.forEach(System.out::println);
    }
}
