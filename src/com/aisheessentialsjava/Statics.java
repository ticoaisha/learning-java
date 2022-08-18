package com.aisheessentialsjava;

import java.util.ArrayList;
import java.util.List;

public class Statics {

    /*
    * now I can access this variable inside the cass Person, for example. I can do:
    * Statics.BRAND inside the constructor Person inside the class Person
    * */
    public static final String BRAND;
    static List list;

    /*
    * static block below can be used to initialize any static field
    * */
    static{
        BRAND = "amigoscode";
        list = new ArrayList();
        list.add("");
    }

    public static void main(String[] args) {
        /*
         * public static void main is an entry point of every Java program
         * it has to be static
         * if it will not be static, there is no way to run the program
         *
         * static -> means that it belongs to the class itself, instead to each of the Object, or instances
         * used to have some shared data across all the objects
         *
         * static -> also for initializing
         * static -> to define constants
         *
         *
         * */

        /*
        * so in this example varibale - static int createdPeople = 0 - shared among all the objects
        * */
        Person alex = new Person("alex");
        Person bob = new Person("bob");
        System.out.println(alex.name);
        System.out.println(bob.name);
        System.out.println(Person.createdPeople);
//        we can do the above because createdPeople does not belong to alex nor bob. It belongs to the Person class
//        because createdPeople is static
    }


    /*
    * This class is static as I want to use it inside the main method
    * */
        static class Person{
            static int createdPeople = 0;
            String name;
            Person(String name){
                this.name = name;
                createdPeople++;
            }
        }

    }

