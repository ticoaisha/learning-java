package com.aisheessentialsjava;

/*
Abstraction -> process of hiding certain details and showing only essential info to the users

We can abstract Animal class and have subclasses that define some behaviors

Abstract methods have no implementation

Abstract method -> anyone that extent this class has to implement abstract methods from the abstract class

* Abstract class cannot be instantiated meaning cannot create objects from it


Another way of achieving abstraction is using interfaces
* */
abstract public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    /*
    * We are overriding toString method to have String representation of an Object
    * */
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
