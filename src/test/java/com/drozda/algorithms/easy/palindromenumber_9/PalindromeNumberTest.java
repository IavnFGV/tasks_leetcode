package com.drozda.algorithms.easy.palindromenumber_9;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberTest {

    @Test
    public void shouldNotBePalindrome_MINUS_2147447412() {
        Assert.assertFalse(PalindromeNumber.isPalindrome(-2147447412));
    }

    @Test
    public void shouldBePalindrome_zero() {
        Assert.assertTrue(PalindromeNumber.isPalindrome(0));
    }


    @Test
    public void shouldBePalindrome_2147447412() {
        Assert.assertTrue(PalindromeNumber.isPalindrome(2147447412));
    }

}