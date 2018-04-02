package com.drozda.algorithms.easy.validparentheses_20;

import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesesTest {
    @Test
    public void shouldReturnFalseOnCloseParentheses() {
        Assert.assertFalse(ValidParentheses.isValid("]"));
    }

    @Test
    public void shouldReturnFalseOnOneOpenparetheses() {
        Assert.assertFalse(ValidParentheses.isValid("{"));
    }


}