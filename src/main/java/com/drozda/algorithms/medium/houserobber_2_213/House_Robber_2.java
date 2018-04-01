package com.drozda.algorithms.medium.houserobber_2_213;

import java.util.Arrays;

public class House_Robber_2 {

    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        return Math.max(
                robStraight(Arrays.copyOfRange(nums,0,nums.length-1)),
                robStraight(Arrays.copyOfRange(nums,1,nums.length))
        );
    }


    public static int robStraight(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int f0 = nums[0];
        int f1 = Math.max(nums[0], nums[1]);
        int fn = 0;

        if (nums.length == 2) {
            return f1;
        }

        for (int i = 2; i < nums.length; i++) {
            fn = Math.max(f1, f0 + nums[i]);
            f0 = f1;
            f1 = fn;
        }

        return fn;
    }

}
