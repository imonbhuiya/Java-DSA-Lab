package org.coredemo.dsa.stack.exercises;

import java.util.ArrayDeque;
import java.util.Deque;

public class MatchingBrackets {

    public static void main(String[] args) {

        String input = "{[()]}";

        Solution solution = new Solution();

        boolean result = solution.isValid(input);

        System.out.println("Valid: " + result);
    }
}

class Solution {

    public boolean isValid(String input) {

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {

            char charAt = input.charAt(i);

            // Opening brackets
            if (charAt == '(' || charAt == '{' || charAt == '[') {

                stack.push(charAt);

            } else if (charAt == ')' || charAt == '}' || charAt == ']') {

                // Closing bracket but nothing to match
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.peek();

                // Check correct matching pair
                if ((charAt == ')' && top == '(')
                        || (charAt == '}' && top == '{')
                        || (charAt == ']' && top == '[')) {

                    stack.pop();

                } else {
                    return false;
                }
            }
        }

        // No unmatched opening brackets should remain
        return stack.isEmpty();
    }
}