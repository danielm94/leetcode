package com.github.danielm94.easy;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();

        for (var i = 0; i < nums.length; i++) {
            map.put(target - nums[i], i);
        }

        for (var i = 0; i < nums.length; i++) {
            var value = map.get(nums[i]);
            if (value != null && value != i) return new int[]{i, map.get(nums[i])};
        }
        return null;
    }

    public int[] twoSumImproved(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();
        for (var i = 0; i < nums.length; i++) {
            var diff = target - nums[i];
            if (map.containsKey(diff)) return new int[]{map.get(diff), i};
            map.put(nums[i], i);
        }
        return null;
    }
}
