package com.aisheessentialsjava;

import java.util.Stack;
/*
* Stacks -> LIFO
* */
public class WorkingWithStacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        //peek just looks at the top of the stack
        //pop removes and return the top element
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();

        System.out.println(stack);
    }
}
