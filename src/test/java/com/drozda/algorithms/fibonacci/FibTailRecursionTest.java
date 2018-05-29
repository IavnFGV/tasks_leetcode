package com.drozda.algorithms.fibonacci;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibTailRecursionTest {

    @Test
    public void calc() {
        assertEquals(144l,new FibTailRecursion().calc(12));
    }
}