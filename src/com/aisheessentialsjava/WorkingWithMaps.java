package com.aisheessentialsjava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
* Map is an Interface
* it allows to store key value pairs
*
* Duplicate keys are not allowed
* map.put(3, "Alice");
  map.put(3, "Carla");
* if we will try to get element under index 3, we will get Carla, as it will override Alice
*
* keys and values can be any data type
*
* */
public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Hanna");
        map.put(2, "Jamil");
        map.put(3, "Alice");
        map.put(3, "Carla");


        System.out.println(map);

        String mapValue = map.get(3);
        System.out.println(mapValue);

        Set<Integer> mapKeys = map.keySet();
        System.out.println(mapKeys);

        /*
        * Looping through Map
        * */
        for(int key : map.keySet()){
            String valueOfKey = map.get(key);
            System.out.println(valueOfKey);
        }

        map.forEach((k, v) -> {
            System.out.println(k + " - " + v);
        });

        /*
        * I want to get value for the particular key, but if I don't have it, return the default value String
        * */

        String defaultV = map.getOrDefault(2, "oops this is default value ");
        System.out.println(defaultV);

    }
}
