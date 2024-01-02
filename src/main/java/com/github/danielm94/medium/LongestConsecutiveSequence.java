package com.github.danielm94.medium;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        var numSet = new HashSet<Integer>();
        for (var num : nums) {
            numSet.add(num);
        }

        var longestConsecutive = 0;

        for (var num : numSet) {
            if (!numSet.contains(num - 1)) {
                var count = 1;
                var nextNum = num + 1;
                while (numSet.contains(nextNum++)) {
                    count++;
                }
                longestConsecutive = Math.max(longestConsecutive, count);
            }
        }
        return longestConsecutive;
    }
}
