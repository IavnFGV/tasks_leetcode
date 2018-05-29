package com.drozda.algorithms.fibonacci;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibIterativeTest {

    @Test
    public void calc() {
        assertEquals(144l, new FibIterative().calc(12));
    }
}