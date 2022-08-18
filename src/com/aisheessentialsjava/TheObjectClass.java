package com.aisheessentialsjava;

import java.awt.*;

public class TheObjectClass {
    public static void main(String[] args) {

        /*
        * Object is the root of all the other classes
        * all the methods of the Object class are available for other classes
        *
        * */

        Object name = "Jamil";//we can do this instead of writing: String name = "Jamil";
        System.out.println(name);

        Object[] nameArray = {"Jamil"};
        Object p = new Point();//this p will have methods available for "Object" class
        //Point p = new Point(); // if I will do this p will have methods available for "Point" class

    }
}
