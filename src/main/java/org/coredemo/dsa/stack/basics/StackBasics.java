package org.coredemo.dsa.stack.basics;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackBasics {

    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();



        // Add elements
        stack.push(5);
        stack.push(10);
        stack.push(15);

        // Print current top
        System.out.println("Top: " + stack.peek());

        // Remove top
        int removed = stack.pop();
        System.out.println("Removed: " + removed);

        // Print new top
        System.out.println("New Top: " + stack.peek());

        // Check whether stack is empty
        System.out.println("Is Empty: " + stack.isEmpty());
    }
}