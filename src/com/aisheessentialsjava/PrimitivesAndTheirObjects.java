package com.aisheessentialsjava;

import java.util.List;

public class PrimitivesAndTheirObjects {
    public static void main(String[] args) {
        /*
        * int number = 1;
        *
        * if I want to work with primitive (like above) in an object-oriented way so primitive will be as an object,
        * I can use object version of that primitive type
        *
        * for every primitive we have object equivalent
        *
        * */

        Integer number = 1;//this is the same as: Integer number = new Integer(1);
        // now this number will have methods available to work with

        /*
        * The list below accepts different types of variables        *
        * */
        List numbers = null;
        numbers.add(1);
        numbers.add("1");

        //This list accepts only integers
//        List<Integer> numbersOnly = null;
//        numbersOnly.add(1);

        //
//        int numberOne = null; //this will not work
        Integer numberTwo = null;


    }
}
