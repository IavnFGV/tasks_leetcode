package com.drozda.algorithms.easy.palindromenumber_9;

import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeNumber {

    public static final int METHOD = 1;

    public static boolean isPalindrome(int x) {
        if (METHOD == 0) {
            return x >= 0 && x == straightReverse(x);
        }
        if (METHOD == 1) {
            return x >= 0 && checkPalindromDigitByDigit(x);
        }
        return false;
    }

    private static boolean checkPalindromDigitByDigit(int x) {
        int digitCount = countDigits(x);
        Deque<Integer> digits = new ArrayDeque<>();
        for (int i = 0; i < digitCount; i++) {
            digits.add(extractDigit(x, i));
        }

        while (digits.size() > 1) {
            if (digits.removeFirst() != digits.removeLast()) {
                return false;
            }
        }
        return true;
    }

    static int straightReverse(int x) {
        double rev = 0;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) rev;
    }


    private static int extractDigit(int from, int position) {
        return (int) (from / Math.pow(10, position)) % 10; // where 3 is the i th place i.e. 100th place of 3 in 372.
    }

    private static int countDigits(int input) {
        return (int)
                Math.log10(
                        Math.abs(input)
                ) + 1;
    }

}
