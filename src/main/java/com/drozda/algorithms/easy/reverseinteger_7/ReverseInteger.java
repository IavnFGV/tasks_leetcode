package com.drozda.algorithms.easy.reverseinteger_7;

public class ReverseInteger {


    public static int reverse(int x) {
        double res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }

        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
            res = 0;

        return (int) res;
    }
}
