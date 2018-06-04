package com.drozda.algorithms.everydaytask;

import java.util.List;

public class SumOfNonNeighbors {

    public static long calculate(List<Long> list) {
        long n_0, n_1, n_2;
        n_0 = 0;
        n_2 = list.get(0);
        n_1 = Math.max(n_2, list.get(1));
        for (int i = 2; i <= list.size() - 1; i++) {
            n_0 = Math.max(list.get(i) + n_2, n_1);
            n_2 = n_1;
            n_1 = n_0;
        }
        return n_0;
    }
}
