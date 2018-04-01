package com.drozda.algorithms.medium.houserobber_2_213;

import org.junit.Assert;
import org.junit.Test;

public class House_Robber_2Test {
    @Test
    public void shouldReturn16On9_1_7_9() {
        Assert.assertEquals(16, House_Robber_2.rob(new int[]{9, 1, 7, 9}));
    }
}