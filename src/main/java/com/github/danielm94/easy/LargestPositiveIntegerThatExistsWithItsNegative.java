package com.github.danielm94.easy;

import java.util.HashSet;

public class LargestPositiveIntegerThatExistsWithItsNegative {
    public int findMaxK(int[] nums) {
        var result = -1;
        var set = new HashSet<Integer>();

        for (var num : nums) {
            set.add(num);
        }

        for (var num : nums) {
            if (set.contains(-num)) result = Math.max(Math.abs(num), result);
        }

        return result;
    }
}
