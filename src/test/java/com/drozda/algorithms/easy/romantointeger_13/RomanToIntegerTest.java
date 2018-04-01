package com.drozda.algorithms.easy.romantointeger_13;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(JUnitParamsRunner.class)
public class RomanToIntegerTest {

    @Test
    @Parameters(
            {   "I, 1",
                "V, 5",
                "X, 10",
                "L, 50",
                "C, 100",
                "D, 500",
                "IV, 4",
                "IX, 9",
                "XL, 40",
                "XC, 90",
                "CD, 400",
                "CM, 900",
                "MMMMDLXXVII, 4577"
            })
    public void personIsAdult(String roman , int value) {
        Assert.assertEquals(value,RomanToInteger.romanToInt(roman));
    }





}