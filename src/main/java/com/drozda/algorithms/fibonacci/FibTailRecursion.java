package com.drozda.algorithms.fibonacci;

import java.math.BigDecimal;

public class FibTailRecursion implements FibCalculator {
    @Override
    public long calc(int index) {
        return calc(index, BigDecimal.ONE, BigDecimal.ZERO).longValueExact();
    }

    public BigDecimal calcBigDecimal(int index) {
        return calc(index, BigDecimal.ONE, BigDecimal.ZERO);
    }


    private BigDecimal calc(int index, BigDecimal n_1, BigDecimal n_2) {
        return index == 0 ? n_2 : calc(index - 1, n_1.add(n_2) , n_1);
    }
}
