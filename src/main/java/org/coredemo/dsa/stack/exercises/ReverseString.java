package org.coredemo.dsa.stack.exercises;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseString {
    public static void main(String[] args) {
        String input = "JAVA";
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()){
            reversed.append(stack.pop());

        }
        System.out.println("Output: " + reversed.toString());


    }
}
