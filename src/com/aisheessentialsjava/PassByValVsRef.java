package com.aisheessentialsjava;

import java.awt.*;

public class PassByValVsRef {

    public static void main(String[] args) {
        int x = 0;
        int y = incrementValue(x);
        System.out.println(x);
        System.out.println(y);
        //
        Point point = new Point(100, 100);
        changePoint(point);
        System.out.println(point);



    }


    /*
     * when we are passing primitive (int value), it passes the primitive by value
     * it passes a copy of the actual variable -> just a copy, not the actual variable
     * (int value) is a copy, not the actual value
     *
     * here (int value) is a parameter
     *
     * we should never mutate the primitive value (in int incrementValue method (int value) is primitive value),
     * instead we should return the brand new one
     *
     * so instead of the below static void incrementValue method do the following -> static int incrementValue(int value)
     *
     * with primitive types, the original value is not changing
     * */
   /* static void incrementValue(int value){
        // value = value + 1;// this is the same as value++
        value++;//this value internally creating a variable in memory and holding the actual value 0 and then ++ and then 1
    }*/

    /*
    * reference types or Objects are passed by reference
    * primitive types are passed by value
    *
    * with reference types we are mutating whatever we are passing to a method,
    * whereas with primitives, we don't because it passed by value or copy
    * */

    static void changePoint(Point point){
        point.x = 0;
        point.y = 0;
    }


    static int incrementValue(int value) {

        return value + 1;
    }
}
