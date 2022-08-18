package com.aisheessentialsjava;

public class Iphone {
    /*
    * Refer to "Classes" class where objets of the Iphone are created
    * */

    /*
    * below are the properties
    *
    * before it was private String model,
    * after creating Enum IphoneModel class we renamed to datatype IphoneModel
    *
    * Encapsulation -> data of the classes should be hidden from outside world
    * only accessible through its own methods
    *
    * */
    private IphoneModel model;
    private double price;
    private boolean isWaterResistant;

    /*
    * by default every class comes with the default constructor
    * that's why we can: Iphone iphone7Plus = new Iphone();
    *
    * constructors need to be unique
    * */

    /*
    * this is the default constructor
    * even if I will not write it, it is given by default
    * */
    public Iphone(){
    }


    /*
    * this.model refers to the current instance of the current class, which is private String model;
    * model after = sign comes from the constructor - String model
    * */
    public Iphone (IphoneModel model, double price, boolean isWaterResistant){
        this.model = model;
        this.price = price;
        this.isWaterResistant = isWaterResistant;
    }

    /*
    * this() -> we can call out to other constructors, so we can reuse constructors
    *
    * */
    public Iphone(IphoneModel model){
        this(model, 10.00, false);
        this.model = model;
    }

    public Iphone(IphoneModel model, double price){
        this(model, price, true);
        this.model = model;
        this.price = price;
    }

    /*
    * below methods are the actual behaviors
    * Getters and Setters
    *
    * word "this" refers to the current instance of the current Class
    * */
    public IphoneModel getModel() {
        return model;
    }

    public void setModel(IphoneModel model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isWaterResistant() {
        return isWaterResistant;
    }

    public void setWaterResistant(boolean waterResistant) {
        this.isWaterResistant = waterResistant;
    }

    /*
    * toString method -> String representation of any given object
    * */
    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", isWaterResistant=" + isWaterResistant +
                '}';
    }
}
