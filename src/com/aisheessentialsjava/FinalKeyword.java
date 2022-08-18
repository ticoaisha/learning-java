package com.aisheessentialsjava;

import java.awt.*;

public class FinalKeyword {
    public static void main(String[] args) {
        /*
        * final keyword -> not be able to change the original value once it has been initialized
        * final also works with methods, classes
        * use final when you know that things will not change, for example the number of PI
        * */
        final var name = "Anna";
        /*name = "Alex";// this gives an error after I put "final" word as "final" does not allow to change the original value
        name = "Jamila";*/

        final var number = 0;
        final var anotherName = Math.PI;

        /*
        * with objects final works different
        *
        * */
        final Point point = new Point(0,0);
        //point = new Point(100,100);//can't do that after I put "final" keyword, meaning I can't reassign
        //but I can change the actual content (actual attributes) of that point
        point.x = 100;
        point.y = 100;


    }
}
