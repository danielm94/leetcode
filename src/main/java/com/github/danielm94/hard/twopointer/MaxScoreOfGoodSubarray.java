package com.github.danielm94.hard.twopointer;

public class MaxScoreOfGoodSubarray {
    public int maximumScore(int[] nums, int k) {
        var left = k;
        var right = k;
        var maxScore = nums[k];
        var minValue = nums[k];

        while (left > 0 || right < nums.length - 1) {
            if (left == 0 || right < nums.length - 1 && nums[right + 1] > nums[left - 1]) right++;
            else left--;

            minValue = Math.min(minValue, Math.min(nums[left], nums[right]));
            maxScore = Math.max(maxScore, minValue * (right - left + 1));
        }

        return maxScore;
    }

}
