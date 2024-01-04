package com.github.danielm94.medium;

//TODO:SOLVE THIS
public class MaximumProductSubArray {
    public int maxProductBruteForce(int[] nums) {
        if (nums == null || nums.length == 0) throw new IllegalArgumentException("Array cannot be null or empty.");

        var max = Integer.MIN_VALUE;
        for (var i = 0; i < nums.length; i++) {
            var product = 1;
            for (var j = i; j < nums.length; j++) {
                product *= nums[j];
                max = Math.max(max, product);
            }
        }

        return max;
    }

    public int maxProductBetter(int[] nums) {

        return 0;
    }
}
