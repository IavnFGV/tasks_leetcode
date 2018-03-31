package com.drozda.algorithms.easy.reverseinteger_7;

import org.junit.Assert;
import org.junit.Test;

public class ReverseIntegerTest {

    @Test
    public void shouldReturn123(){
        Assert.assertEquals(123, ReverseInteger.reverse(321));
    }

    @Test
    public void shouldReturnMinus123(){
        Assert.assertEquals(-123, ReverseInteger.reverse(-321));
    }

    @Test
    public void shouldReturn21(){
        Assert.assertEquals(21, ReverseInteger.reverse(120));
    }

    @Test
    public void shouldReturnMinus21(){
        Assert.assertEquals(-21, ReverseInteger.reverse(-120));
    }

    @Test
    public void shouldReturn0(){
        Assert.assertEquals(0, ReverseInteger.reverse(0));
    }

    @Test
    public void shouldReturn0OnOverflow(){
        Assert.assertEquals(0, ReverseInteger.reverse(1534236469));
    }


    @Test
    public void shouldReturn1(){
        Assert.assertEquals(1, ReverseInteger.reverse(1));
    }



}
