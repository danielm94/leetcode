package com.github.danielm94.medium;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelfICantRead(int[] nums) {
        var product = 1;
        var productWithoutZeros = 1;
        var zeroCount = 0;
        for (var num : nums) {
            product *= num;
            if (num == 0) {
                zeroCount++;
            } else {
                productWithoutZeros *= num;
            }
        }

        var result = new int[nums.length];
        for (var i = 0; i < result.length; i++) {
            if (nums[i] == 0) {
                if (zeroCount == 1) result[i] = productWithoutZeros;
                else result[i] = 0;
            } else result[i] = product / nums[i];
        }
        return result;
    }

    public int[] productExceptSelf(int[] nums) {
        var length = nums.length;
        var result = new int[length];
        if (length == 0) return result;

        var left = new int[length];
        left[0] = 1;
        result[length - 1] = 1;

        for (var i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        for (var i = length - 2; i >= 0; i--) {
            result[i] = result[i + 1] * nums[i + 1];
        }

        for (var i = 0; i < length; i++) {
            result[i] *= left[i];
        }

        return result;
    }
}
