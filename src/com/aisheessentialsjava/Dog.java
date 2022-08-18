package com.aisheessentialsjava;

/*
* Inheritance
* super means that variable "name" (in parentheses after String) will be passed inside the super class Animal
*
* child can have its own properties
*
* @Override -> I'm going to override abstract method
* we can remove @Override word, and it will be ok
* but having this word helps us to see which method of the Parent class is overriden
*
* */
public class Dog implements AnimalInterface {
    private String breed;
    private String name;

    public Dog(String name, String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("woof woof");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
