package com.github.danielm94.easy;

import java.util.HashSet;

public class ArithmeticTriplets {
    public int arithmeticTripletsBruteForce(int[] nums, int diff) {
        var count = 0;

        var length = nums.length;
        for (var i = 0; i < length - 2; i++) {
            for (var j = i + 1; j < length - 1; j++) {
                for (var k = j + 1; k < length; k++) {
                    if (nums[k] - nums[j] == diff && nums[j] - nums[i] == diff) count++;
                }
            }
        }
        return count;
    }

    public int arithmeticTripletsSetSolution(int[] nums, int diff) {
        var count = 0;
        var seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num - diff) && seen.contains(num - diff * 2)) {
                ++count;
            }
            seen.add(num);
        }
        return count;
    }

    public int arithmeticTriplets(int[] nums, int diff) {
        var length = nums.length;
        var count = 0;
        var i = 0;
        var j = i + 1;
        var k = j + 1;

        while (i < length - 2) {
            while (j < length - 1 && nums[j] - nums[i] < diff) {
                j++;
            }
            while (k < length && nums[k] - nums[j] < diff) {
                k++;
            }
            if (j < length - 1 && k < length && nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) {
                count++;
            }
            i++;
        }
        return count;
    }
}
