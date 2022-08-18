package com.aisheessentialsjava;

import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {





       /*
       * The below is one way of initialising and adding values to the array
       * */
//        int[] numbers = new int[3];
//        numbers[0] = 1;
//        numbers[1] = 20;
//        numbers[2] = 500;

        /*
        * Another way of creating arrays
        * */

        int[] numbers = {1, 20, 500, 4};
        numbers[3] = 700; // by this we can change the value of the element of the Array under index[3], which is 4
        System.out.println(Arrays.toString(numbers));

        /*
        * ways of looping through Arrays
        * */
        for(int number : numbers){
            System.out.println(number);
        }
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
