package com.aisheessentialsjava;

public class PrimitiveAndReferenceTypesDifferences {

    public  static void main(String[] args){

        /*
        * primitive types
        * stored separately in a memory
        *
        * */
        int a = 10;
        int b = a;//the value to b here is passed by copy, so this is a copy of a
        a = 100;//so when we are changing the value of a here, the value of b is untouched
        System.out.println("a = " + a + " - b = " + b);

        /*
        * Reference types
        *
        * alex is a reference
        * Person("Alex") is an Object
        * reference and an Object are stored SEPARATELY in the memory
        * so reference mariam instead of directly pointing to the alex, points to the Object Person("Alex")
        * reference is pointing to the Object
        *
        * mariam is also a reference
        * so reference mariam is pointing to the Object Person("Alex")
        *
        * */
        Person alex = new Person("Alex");
        Person mariam = alex;

        System.out.println("before changing alex");
        System.out.println(alex.name + " " + mariam.name);

//        alex.name = "Alexander";
        mariam.name = "Mariam";

        System.out.println("after changing alex");
        System.out.println(alex.name + " " + mariam.name);
    }

    static class Person {
        String name;
        Person(String name){
            this.name = name;
        }
    }
}
