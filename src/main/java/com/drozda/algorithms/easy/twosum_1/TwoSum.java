package com.drozda.algorithms.easy.twosum_1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    private static final int METHOD = 1;

    public static Integer[] twoSum(int[] nums, int target) {
        if (METHOD == 0) {
            return twoSumOnlyArray(nums, target);
        }
        if (METHOD == 1) {
            return twoSumHashMap(nums, target);
        }
        return null;
    }

    private static Integer[] twoSumOnlyArray(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int correctCandidate = target - current;
            for (int j = i+1; j <= nums.length - 1; j++) {
                if (nums[j] == correctCandidate) {
                    return new Integer[]{i, j};
                }
            }
        }
        return null;
    }

    private static Integer[] twoSumHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int correctCandidate = target - nums[i];
            if(map.containsKey(correctCandidate)){
                return new Integer[]{i, map.get(correctCandidate)};
            }
            map.put(nums[i],i);
        }
        return null;
    }

}
