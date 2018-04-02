package com.drozda.algorithms.easy.validparentheses_20;

import java.util.*;

public class ValidParentheses {
    private static Set<Character> openParentheses = new HashSet<>();
    private static Map<Character, Character> closingParentheses = new HashMap<>();

    static {
        openParentheses.add('(');
        openParentheses.add('{');
        openParentheses.add('[');
        closingParentheses.put(')', '(');
        closingParentheses.put('}', '{');
        closingParentheses.put(']', '[');
    }

    public static boolean isValid(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        Deque<Character> stack = new ArrayDeque<>(s.length());

        for (Character c : s.toCharArray()) {
            if (openParentheses.contains(c)) {
                stack.addFirst(c);
            } else {
                if (!closingParentheses.get(c).equals(stack.pollFirst())) {
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }
}
