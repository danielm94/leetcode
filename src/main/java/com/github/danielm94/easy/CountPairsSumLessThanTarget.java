package com.github.danielm94.easy;

import java.util.Collections;
import java.util.List;

public class CountPairsSumLessThanTarget {
    public int countPairsBruteForce(List<Integer> nums, int target) {
        var count = 0;
        for (var i = 0; i < nums.size() - 1; i++) {
            for (var j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) count++;
            }
        }
        return count;
    }

    public int countPairs(List<Integer> nums, int target) {
        var count = 0;
        Collections.sort(nums);
        var left = 0;
        var right = nums.size() - 1;
        while (left < right) {
            var leftNum = nums.get(left);
            var rightNum = nums.get(right);
            var sum = leftNum + rightNum;
            if (sum < target) {
                count += right - left;
                left++;
            } else {
                right--;
            }
        }
        return count;
    }
}
