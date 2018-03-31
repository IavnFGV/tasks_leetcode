package com.drozda.algorithms.easy.reverseinteger_7;

public class ReverseInteger {


    public static int reverse(int x) {
        long rev= 0;
        while( x != 0){
            rev= rev*10 + x % 10;
            x= x/10;
            if( rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
                return 0;
        }
        return (int) rev;
    }


    private static int countDigits(int input) {
        return (int)
                Math.log10(
                        Math.abs(input)
                ) + 1;
    }
}
