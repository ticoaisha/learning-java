package com.aisheessentialsjava;

public class AccessModifiers {
    public static void main(String[] args) {
        /*
        * Access modifier means who can call this method or class
        *
        *
        * when no access modifier is specified, means that it is package protected
        * static class Lens{} -> means package protected
        * package protected, so it means that this class cannot be accessed outside of this package
        * so package protected class can be accessed only from the package where this class is located
        *
        *
        * public -> accessible from everything, not package protected
        * private -> only accessible within this class
        *
        * protected -> we will learn when we will learn inheritance
        *
        *
        * */
        Lens lens = new Lens();

    }

    /*
    * see package foo and class Main inside
    * from that class we were able to access this class outside of its package,
    *  because it is public now
    *
    * see class Foo, from where you can access class Lens when it is just static class Lens{}
    * because Foo is within the same package as AccessModifiers class
    *
    * */
    public static class Lens{}
}
