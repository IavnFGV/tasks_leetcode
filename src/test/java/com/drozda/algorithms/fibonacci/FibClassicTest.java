package com.drozda.algorithms.fibonacci;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibClassicTest {

    @Test
    public void calc() {
        assertEquals(144l,new FibClassic().calc(12));
    }
}