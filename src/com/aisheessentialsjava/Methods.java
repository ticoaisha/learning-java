package com.aisheessentialsjava;

import java.time.LocalDate;

public class Methods {
    public static void main(String[] args) {
        /*
        * static -> means that this method belongs to a class, not an instance
        * () -> in () of the method are the arguments
        * arguments are the data that we are passing to the method to actually work with
        *
        * return type in method can be anything: int, String, Object
        *
        *
        * */

        int x = incrementNumber(0);
        print(x);// we cannot do: int y = print(x); as this method is void type, it does not return anything
        var now = getCurrentDate();// so we can't pass anything in () when we are calling this method because it does not accept anything
        var days = getDateMinusDays(10);
        var daysA = getDateMinusDays(100);

    }


    private static int incrementNumber(int value){
        return value +1;
    }

    private static void print(int value){
        System.out.println(value);
    }

    private static LocalDate getCurrentDate(){
        return LocalDate.now();
    }

    private static LocalDate getDateMinusDays(int v){
        return LocalDate.now().minusDays(v);
    }

}
