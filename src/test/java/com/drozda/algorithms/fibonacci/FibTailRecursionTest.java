package com.drozda.algorithms.fibonacci;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibTailRecursionTest {

    @Test
    public void calc() {
        System.out.println(new FibTailRecursion().calcBigDecimal(678));
//        assertEquals(144l,new FibTailRecursion().calc(12));
    }
}