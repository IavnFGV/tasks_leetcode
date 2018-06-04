package com.drozda.algorithms.everydaytask;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SumOfNonNeighborsTest {

    @Test
    public void test1(){
        Assert.assertEquals(13L,SumOfNonNeighbors.calculate(Arrays.asList(2L, 4L, 6L, 2L, 5L)));
        Assert.assertEquals(10L,SumOfNonNeighbors.calculate(Arrays.asList(5L, 1L, 1L, 5L)));
    }



//    For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5. [5, 1, 1, 5] should return 10, since we pick 5 and 5.



}