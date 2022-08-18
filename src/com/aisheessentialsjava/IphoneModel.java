package com.aisheessentialsjava;

/*
 * Enum class allows represent the group of constants
 *
 *
 * */
public enum IphoneModel {
IPHONE_7_PLUS("Iphone 7+"),
    IPHONE_7("Iphone 7"),
    IPHONE_X("Iphone X"),
    IPHONE_8_PLUS("Iphone 8+");

    private String modelStr;

    IphoneModel(String modelStr) {
        this.modelStr = modelStr;
    }

    public String getModelStr() {
        return modelStr;
    }
}
