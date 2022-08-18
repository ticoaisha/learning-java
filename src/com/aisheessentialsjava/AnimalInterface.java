package com.aisheessentialsjava;

/*
* Interfaces do not have properties
* no methods with implementation
*
* only abstract methods, so we can avoid writing "public abstract" before the method
*
* objects can implement Interfaces not extend
*
* Interfaces are for the scenarios where you have more than one implementation
* Anyone who wants to use this Interface, must implement all the abstract methods defined in the Interface
*
* Abstract classes -> when you have some common codes that should be used across all subclasses
* Abstract class can have abstract and not abstract methods
*
* With Interfaces, we can have class implementing more than one Interface
* With Abstract classes, you can extend only one abstract class
*
*
* */
public interface AnimalInterface {
    void makeSound();
    String getName();
}
