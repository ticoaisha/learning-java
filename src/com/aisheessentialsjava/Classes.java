package com.aisheessentialsjava;

public class Classes {
    public static void main(String[] args) {

        /*
        * Classes is a blueprint to create smthg we want (Object)
        * Class has attributes (or properties that objects have)
        * Class also has behaviors - what objects can do
        * Iphone is the template
         * iphone7Plus is the actual object
         *
         * we are referring to an object as instance
         * as soon as we are saying "new" this object iphone7Plus becomes an instance of the Iphone()
         *
         * with iphone8Plus -> even though we created an object using constructor with just a model
         * when it is printing, it will print the default value that we specified for the price and ifWaterResistant
         * in the Iphone class under the below constructor
         *
         * public Iphone(String model){
        this(model, 10.00, false);
        this.model = model;
    }
         *
         *
         * toString -> allows String representation of the Object
         * see Iphone class -> public String toString() method
        * */
        Iphone iphone7Plus = new Iphone(IphoneModel.IPHONE_7_PLUS, 200.00, false);
//        Iphone iphone8Plus = new Iphone("8+");
        Iphone iphone8Plus = new Iphone(IphoneModel.IPHONE_8_PLUS, 150.00);

        Iphone iphoneXMas = new Iphone();

        Iphone iphoneX = new Iphone(IphoneModel.IPHONE_X, 1550.00);


        /*
        * with the below we are invoking the behaviors of the iPhone
        * we can use constructors instead of using Setters
         * we can use Setters to change the initial value
         *
        * */
        System.out.println("7+");
//        iphone7Plus.setModel("7+");
//        iphone7Plus.setPrice(100.00);
        iphone7Plus.setWaterResistant(false);
//
        System.out.println(iphone7Plus.getModel());
        System.out.println(iphone7Plus.getPrice());
        System.out.println(iphone7Plus.isWaterResistant());

        //this will call toString method
        System.out.println(iphone7Plus);

        //String representation of the Enum
        System.out.println(iphone7Plus.getModel());
        System.out.println(iphone7Plus.getModel().getModelStr());


        System.out.println("8+");
        System.out.println(iphone8Plus.getModel());
        System.out.println(iphone8Plus.getPrice());
        System.out.println(iphone8Plus.isWaterResistant());

//
//        System.out.println();
//        System.out.println("XMax");
//        iphoneXMas.setModel("XMax");
//        iphoneXMas.setPrice(1300.00);
//        iphoneXMas.setWaterResistant(true);
//
//        System.out.println(iphoneXMas.getModel());
//        System.out.println(iphoneXMas.getPrice());
//        System.out.println(iphoneXMas.isWaterResistant());

    }
    public class Samsung{

    }
}
