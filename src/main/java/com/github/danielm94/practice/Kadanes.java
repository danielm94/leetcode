package com.github.danielm94.practice;

public class Kadanes {

    public int largestSubArrayBruteForce(int[] nums) {
        if (nums == null || nums.length == 0) throw new IllegalArgumentException("Array cannot be null or empty.");
        var max = Integer.MIN_VALUE;
        for (var i = 0; i < nums.length; i++) {
            var sum = 0;
            for (var j = i; j < nums.length; j++) {
                sum += nums[j];
                max = Math.max(sum, max);
            }
        }
        return max;
    }

    public int largestSubArrayKadanes(int[] nums) {
        if (nums == null || nums.length == 0) throw new IllegalArgumentException("Array cannot be null or empty.");
        var max = nums[0];
        var currSum = 0;
        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], nums[i] + currSum);
            max = Math.max(currSum, max);
        }

        return max;
    }
}
