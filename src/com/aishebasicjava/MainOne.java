package com.aishebasicjava;

public class MainOne {

    public static void main(String[] args) {
//in () we are passing the arguments
        Lens lensOne = new Lens("sony", "85mm", true); //variable "lensOne" here is the real object

        Lens lensTwo = new Lens("sony", "30mm", true); //variable "lensOne" here is the real object

        Lens lensThree = new Lens("canon", "24-70mm", false); //variable "lensOne" here is the real object

        //printing object attributes
        System.out.println("Lens 1");
        System.out.println(lensOne.brand);
        System.out.println(lensOne.focalLength);
        System.out.println(lensOne.isPrime);
        System.out.println();

        System.out.println("Lens 2");
        System.out.println(lensTwo.brand);
        System.out.println(lensTwo.focalLength);
        System.out.println(lensTwo.isPrime);
        System.out.println();

        System.out.println("Lens 3");
        System.out.println(lensThree.brand);
        System.out.println(lensThree.focalLength);
        System.out.println(lensThree.isPrime);
    }
        /*
        * Classes and Objects
        * Class is a blueprint
        * from that class we will create an actual object
        *
        * Class name must start with Uppercase
        *
        * We can create an object ouf of the class by passing some properties, like
        * String brand; String focalLength; boolean isPrime below
        *
        * this -> I am referring to the current instance of the current class
        *
        * */

    //this is a blueprint -> class itself and including constructor
    //the below are the properties of the class
        static class Lens {
            String brand;
            String focalLength;
            String model;
            String color;
            double price;
            double weight;
            boolean isPrime;

            //this is called a constructor - is how we construct object
            Lens(String brand, String focalLength, boolean isPrime){
                this.brand = brand;
                this.focalLength = focalLength;
                this.isPrime = isPrime;
            }

        }

    }