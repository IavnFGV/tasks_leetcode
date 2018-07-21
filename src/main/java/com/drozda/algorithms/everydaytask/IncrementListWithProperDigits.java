package com.drozda.algorithms.everydaytask;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class IncrementListWithProperDigits {


    public static List<String> incrementListWithProperDigits(List<String> listToIncrement) {

        int carry = 1;
        int currentIndex = listToIncrement.size() - 1;
        Deque<Integer> result = new LinkedList<>();
        while (currentIndex >= 0) {
            int currentDigit = (Integer.valueOf(listToIncrement.get(currentIndex--)) + carry) % 10;
            if (currentDigit == 0) {
                carry = 1;
            } else {
                carry = 0;
            }
            result.addFirst(currentDigit);
        }

        if (carry == 1) {
            result.addFirst(1);
        }

        return result.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());

    }

}
