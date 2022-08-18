package com.aisheessentialsjava;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone(IphoneModel.IPHONE_7, 290, false);

        /*
        * after making Animal class abstract the below statement is not longer valid
        *
        * */
//        Animal animal = new Animal("bobby");


        /*
        * We can do
        * Dog dog = new Dog("flex", "Bulldog");
        * and instead "Dog" we can put "Animal" because Dog inherits from Animal
        *
        * Animal has getName() but does not have getBreed()
        * that is why System.out.println(dog); -> will give in a console: Animal{name='flex'}
        *
        *
        * */
        AnimalInterface dog = new Dog("flex", "Bulldog");
//        System.out.println(animal.getName());
//        System.out.println(dog.getName() + " is a " + dog.getBreed());
//        System.out.println(dog);
        AnimalInterface cat = new Cat("rosie");

        dog.makeSound();
        cat.makeSound();

        /*
        * Polymorphism -> having many forms
        * examples:
        * dog.makeSound();
        * cat.makeSound();
        * */
        System.out.println("A"+"B");
        System.out.println(1 + 2);

        /*
        * The below are examples of achieving polymorphism by method overriding
        * this is called run-time polymorphism
        * dog.makeSound();
        * cat.makeSound();
        *
        * Another way of achieving polymorphism is method overloading
        * Meaning that we can have the exact same method name, but we did different behaviors
        * and different set of parameters is being passed to it
        *
        * this is compile-time polymorphism
        *
        */

        SuperMath superMath = new SuperMath();
        System.out.println(superMath.add(1,90));
        System.out.println(superMath.add(1,90, 2));

    }
}
