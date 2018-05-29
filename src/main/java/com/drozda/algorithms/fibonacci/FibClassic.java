package com.drozda.algorithms.fibonacci;

public class FibClassic implements FibCalculator {
    @Override
    public long calc(int index) {
        if (index == 0){
            return 0;
        }
        if (index == 1){
            return 1;
        }
        return calc(index-1)+calc(index-2);
    }
}
