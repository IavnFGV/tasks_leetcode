package com.drozda.algorithms.fibonacci;

public class FibTailRecursion implements FibCalculator {
    @Override
    public long calc(int index) {
        return calc(index,1l,0l);
    }

    private long calc(int index, long n_1, long n_2) {
        return index == 0 ? n_2 : calc(index - 1, n_1 + n_2, n_1);
    }
}
