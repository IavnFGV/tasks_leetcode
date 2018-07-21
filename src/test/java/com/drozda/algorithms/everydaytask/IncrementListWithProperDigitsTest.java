package com.drozda.algorithms.everydaytask;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class IncrementListWithProperDigitsTest {

    @Test
    public void test1() {
        assertEquals(Arrays.asList("1", "2", "3", "4", "6"),
                IncrementListWithProperDigits.incrementListWithProperDigits(Arrays.asList("1", "2", "3", "4", "5")));
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList("1", "2", "3", "5", "0"),
                IncrementListWithProperDigits.incrementListWithProperDigits(Arrays.asList("1", "2", "3", "4", "9")));
    }

    @Test
    public void test3() {
        assertEquals(Arrays.asList("1", "0", "0", "0", "0"),
                IncrementListWithProperDigits.incrementListWithProperDigits(Arrays.asList("9", "9", "9", "9")));
    }

}