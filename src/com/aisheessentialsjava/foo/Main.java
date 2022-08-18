package com.aisheessentialsjava.foo;

import com.aisheessentialsjava.AccessModifiers;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AccessModifiers.Lens lens = new AccessModifiers.Lens();

        List<Integer> values = List.of(3, 4,27,5,8);
        int item = 3;

        int index = values.indexOf(item);
        System.out.println(index);

Collections.reverse(values);
        System.out.println(values);




    }
}
