package com.drozda.algorithms.easy.twosum_1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.containsInAnyOrder;


public class TwoSumTest {

    @Test
    public void test_2_7_11_15_target_9() {
        int[] nums = {2, 7, 11, 15};

        Assert.assertThat(Arrays.asList(TwoSum.twoSum(nums, 9)), containsInAnyOrder(0, 1));
    }

    @Test
    public void test_3_2_4_target_6() {
        int[] nums = {3, 2, 4};

        Assert.assertThat(Arrays.asList(TwoSum.twoSum(nums, 6)), containsInAnyOrder(1, 2));
    }

}