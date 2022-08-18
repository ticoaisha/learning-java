package com.aishebasicjava;

import java.time.LocalDate;

public class MainTwo {

    public static void main(String[] args) {
        //Classes
    }
        Passport ukPassport = new Passport("1234","UK", LocalDate.of(2025, 1, 1));

    Passport usPassport = new Passport("12349","USA", LocalDate.of(2023, 1, 1));

    static class Passport{
        String number;
        String country;
        LocalDate expiryDate;

        //number and expiryDate in () here represent current instance of the current class
        Passport(String number, String country, LocalDate expiryDate){
            this.number = number;
            this.country = country;
            this.expiryDate = expiryDate;
        }
    }

}
