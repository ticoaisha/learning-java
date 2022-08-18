package com.aisheessentialsjava;

import java.util.LinkedList;
import java.util.Queue;

/*
* Queue -> FIFO
* It is an Interface
* It has a lot of implementations
* Mostly we will use LinkedList or PriorityQueue
*
* PriorityQueue stores its elements internally according to the natural order if they implement comparable
*
* offer() will return false when queue is full, return true if the element was added
* add() will throw an exception
*
*
* */
public class WorkingWithQueues {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        queue.add(new Person("James"));
        queue.add(new Person("Jamila"));
        queue.add(new Person("Abu"));
        System.out.println(queue);
        //peek -> who is on the front of the queue
        System.out.println(queue.peek());


        /*
        * The poll() method of Queue Interface returns and
        * removes the element at the front end of the container.
        * It deletes the element in the container.
        * The method does not throw an exception when the Queue is empty,
        * it returns null instead
        *
        * remove() will throw an exception if the queue is empty
        * */
        queue.poll();
        System.out.println(queue);

        /*
        * loop through queue
        * */
        queue.forEach(person -> System.out.println(person.name));
    }

    static class Person{
        String name;
        Person(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
