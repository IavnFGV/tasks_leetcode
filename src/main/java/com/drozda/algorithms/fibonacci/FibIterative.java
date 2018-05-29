package com.drozda.algorithms.fibonacci;

public class FibIterative implements FibCalculator {

    @Override
    public long calc(int index) {
        if (index == 0) {
            return 0;
        }
        if (index == 1) {
            return 1;
        }

        long n_1 = 1;
        long n_2 = 0;
        long n = 1;

        for (int i = 2; i <= index; i++) {
            n = n_1 + n_2;
            n_2 = n_1;
            n_1 = n;
        }


        return n;
    }
}
