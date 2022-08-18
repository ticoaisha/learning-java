package com.aisheessentialsjava;

/*
* Cat implements Interface so no longer access to the super class, that is why
* super(name); inside the constructor is removed
* */
public class Cat implements  AnimalInterface{
    private String name;
    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("miaow miaow");
    }

    @Override
    public String getName() {
        return null;
    }
}
