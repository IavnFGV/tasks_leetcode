package com.drozda.algorithms.easy.houserobber_198;

import org.junit.Assert;
import org.junit.Test;

public class HouseRobberTest {
    @Test
    public void shouldReturn18On9_1_7_9() {
        Assert.assertEquals(18, HouseRobber.rob(new int[]{9, 1, 7, 9}));
    }
}