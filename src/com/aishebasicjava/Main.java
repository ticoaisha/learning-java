package com.aishebasicjava;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*String name = new String("Amigoscode");
        System.out.println(name.toUpperCase());
        LocalDate now = LocalDate.now();
        System.out.println(now);

        Date date = new Date();

        String s = new String();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        int a = 10;
        int b = a;
        a = 100;
        System.out.println("a=" + a + "-b=" + b);

        Person alex = new Person("alex");
        Person mariam = alex;

        System.out.println("before changing alex");
        System.out.println(alex.name + " " + mariam.name);

        alex.name = "Alexander";


        System.out.println("after changing alex");
        System.out.println(alex.name + " " + mariam.name);

        //Arithmetic operations
        System.out.println(10 + 2);
        System.out.println(10 - 2);
        System.out.println(10 * 2);
        System.out.println(10 % 2);

        //Math

        System.out.println(Math.abs(-10));
        System.out.println(Math.max(3.6, 10.11));
        System.out.println(Math.pow(5.0, 2.0));

        //below is the casting the result to the integer
        System.out.println((int) Math.pow(5.0, 2.0));// we put (int) here to make the result as a whole number
        System.out.println((int) Math.sqrt(25));
        System.out.println(Math.PI);

        //Comparison operators
        int khalidAge = 18;
        int mariamAge = 20;
        boolean isKhalidOlderThanMariam = khalidAge > mariamAge;
        System.out.println(isKhalidOlderThanMariam);
        //below in () refers to as boolean expressions < > <= >= == !=
        System.out.println(khalidAge < mariamAge);
        System.out.println(khalidAge == mariamAge);
        System.out.println(khalidAge != mariamAge);
        System.out.println(khalidAge >= mariamAge);
*/
        //logical operators allow us to combine multiple boolean expressions
        //&& -> all the boolean expressions must be "true"
        /*boolean isAdult = false;
        boolean isStudent = true;
        boolean isAmigoscodeMember = true;
        System.out.println("Logical Operators");
        System.out.println(isAdult && isStudent);
        System.out.println(isAdult || isStudent);
        System.out.println();
        System.out.println((isAdult || isStudent) && isAmigoscodeMember);
        System.out.println((!isAdult || isStudent) && !isAmigoscodeMember);
        System.out.println();
        System.out.println(isAdult == true);
        //or can simply do the below
        System.out.println(isAdult);
        //flipping the value
        System.out.println(!isAdult);
        String nameM = "Mark";
        System.out.println();
        System.out.println(10 > 8 || 2 <= 2);
        System.out.println((10 > 8 || 2 <= 2) && isAdult);
        System.out.println(10 > 8 || 2 <= 2 && isAdult);
        System.out.println(2 <= 2 && isAdult);
        System.out.println((10 > 8 || 2 <= 2) && !isAdult && nameM.contains("M"));*/

        //if statements
        /*int age = 15;
        if (age >= 18) {
            System.out.println("Hooray... I am an adult");
        } else if (age >= 16 && age < 18) {
            System.out.println("I am almost an adult");
        } else {
            System.out.println("I am not an adult");
        }*/

        //ternary operator - only if one simple scenario (one if else condition)
        /*int age = 15;
        String message = age >= 18 ? "Hooray... I am an adult" : "I am not an adult";
        System.out.println(message);

        //the above code is doing the same as the below
        *//*if (age >= 18) {
            System.out.println("Hooray... I am an adult");
        } else {
            System.out.println("I am not an adult");
        }*/


        /*//switch statements
        String gender = "female";
        if (gender.equals("FEMALE")) {

        } else if (gender.equals("MALE")) {

        } else if (gender.equals("PREFER_NOT_SAY")) {

        } else {

        }
//use switch statement only when we are switching on the single value
        switch (gender.toUpperCase(Locale.ROOT)) {
            case "FEMALE":
                System.out.println("I am a female");
                break;
            case "MALE":
                System.out.println("Male");
                break;
            case "PREFER_NOT_SAY":
                System.out.println("Prefer non to say");
                break;
            default:
                System.out.println("Unknown gender");
        }*/

        //Arrays
        /*int zero = 0;
        int one = 1;

        int[] numbers = new int[2];
        System.out.println(Arrays.toString(numbers));

        boolean[] arrayOfBooleans = new boolean[3];
        System.out.println(Arrays.toString(arrayOfBooleans));

        String[] arrayOfStrings = new String[3];
        System.out.println(Arrays.toString(arrayOfStrings));

        int[] numbers1 = new int[3];
        numbers1[0] = 0;
        numbers1[1] = 1;
        numbers1[2] = 2;
        System.out.println(Arrays.toString(numbers1));

        //another way of creating arrays
        //the size with this method is not fixed
        int[] numbers2 = {2,0,1,4};
        System.out.println(Arrays.toString(numbers2));
        //printing the size of the array
        System.out.println(numbers2.length);

        String[] names = {"Ali", "Mariam"};
        System.out.println(Arrays.toString(names));
        System.out.println(names.length);*/

        /*//Arrays and indexes
        //if I want to try to access an index in array, it should be within the range of the array
        int[] numbers = {2,0,1,4,100,4,90,78};
        int oneHundred = numbers[4];
        System.out.println(oneHundred);

        int lastIndexItem = numbers[numbers.length-1];
        System.out.println(lastIndexItem);*/


        /*//Increments
        //++ && --
        int number = 0;
        number++;
        number--;
        //another way of incrementing number
        int number1 = 0;
        number1 +=1;//increment by 1
        number1 +=5;//increment by 5 etc.
        number -=2;//decrement by 2
        System.out.println(number);*/

        //Loops
        /*/int[] numbers = {2,0,1,4,100,4,90,78,77};

        //for loop
        /*for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }*/

        //Enhanced for loop
        //this loop is the same as the above for loop
        //but enhanced for loop does not give you an access to the actual index
        /*System.out.println("Enhanced for loop");
        for(int number : numbers) {
            System.out.println(number);
        }*/

        /*String[] names = {"Anna","Ali"};
        for(String name : names){
            System.out.println(name);
        }*/

        //Looping through the arrays with the help of IDE
       /* int[] numbers = {2,0,1,4,100,4,90,78,77};
        String[] names = {"Anna","Ali"};

        for (int i = 0; i < numbers.length; i++) {
                    }
        for (int i = numbers.length - 1; i >= 0; i--) {
        }
        for (String name : names) {
        }

        //more advanced way of looping through the loop
        Arrays.stream(numbers).forEach(System.out::println);
        Arrays.stream(names).forEach(System.out::println);*/


        /*
        * Break and continue
        * Break allows to break from the loop
        * Continue allows to continue looping through the array
        * Continue is going back to the beginning of the loop
        * line after continue will not be executed
        * */

       /* String[] names = {"Anna","Ali","Bob","Mike"};
        *//*for(String name : names){
            if(name.equals("Bob")){
                break;
            }
            System.out.println(name);
        }*//*

        for(String name : names){
            if(name.startsWith("A")){
                continue;
            }
            System.out.println(name);
        }*/

        /*
        * While Loop
        * allows to loop while the boolean expression evaluates to true              *
        * */

        /*//the below will run forever
        while(true){
            System.out.println("Hi");
        }*/

        /*int count = 0;
        while(count <= 20){
            System.out.println("count " + count);
            count++;
        }*/

        /*
        * Do While Loop
        * we want to do something at least once while inside the loop
        * it executes at least once no matter what
        * */
        /*int count = 21;

        do{
            System.out.println("count " + count);
            count++;
        }
        while(count <= 20);
        {
        }*/

        /*
        * Scanner class
        * scanner in lower case here is an object
        * */
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName);
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("You were born in " + year);

        if(age < 18){
            System.out.println("and you are not an adult");
        }else {
            System.out.println("and you are an adult :)");
        }*/

        /*
        * Methods
        * block of code that runs only when it is called
        * performs any logic
        * we can pass data into the Method, that is called parameters
        *
        * built-in methods and user predefined
        * */

        //
        /*System.out.println("Hello");//println is a method, () implies here that we are invoking the actual method
        String brand = "Samsung";
        System.out.println(brand.toUpperCase());
        System.out.println(brand.startsWith("S"));
        System.out.println(brand.endsWith("g"));*/
        //

        char[] letters = {'A','A','B','C','D','D','D'};
        int count = countOccurrences(letters, 'A');//here I am calling the method, invoking method // those are arguments coming into the method
        System.out.println(count);

    }
    /*
    * public means that it is accessible by other classes
    * static means that it belongs ot a class
    * int is a return type of this method
    * () what we can pass into this method
    * */


    public static int countOccurrences(char [] letters, char searchLetter){
        int count = 0;
        for (char letter : letters){
            if(letter == searchLetter){
                count++;
            }
        }
        return count;
    }

    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    }

}
