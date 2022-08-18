package com.aisheessentialsjava;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        /*
        * We can write:
        * List is an interface and have multiple implementations, including ArrayList
        * So we could write:
        * ArrayList number = new ArrayList();
        *
        * List does not have fixed size as opposed to Arrays
        * we can add as much as we want to the List
        *
        * With the List we do not need toString() method as with Arrays
        * we can just print the List
        *
        * */
        List numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(100);
        numbers.add(9000);

        numbers.remove(1); //want to remove item under index 1
        numbers.add(0, -1);

        System.out.println(numbers);
        System.out.println(numbers.contains(9000));

        numbers.clear();

        System.out.println(numbers.isEmpty());
        System.out.println(numbers.size());
        /*
        * Looping through the List
        * */
//        for(Object number : numbers){
//            System.out.println(number);
//        }
//
//        System.out.println();
//        numbers.forEach(System.out::println);
    }
}
