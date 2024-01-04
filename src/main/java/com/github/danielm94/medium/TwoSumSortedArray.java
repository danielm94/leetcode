package com.github.danielm94.medium;

public class TwoSumSortedArray {
    public int[] twoSum(int[] numbers, int target) {
        var left = 0;
        var right = numbers.length - 1;

        while (left < right && left >= 0 && right < numbers.length) {
            var sum = numbers[left] + numbers[right];
            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                return new int[]{left + 1, right + 1};
            }
        }
        throw new IllegalArgumentException("Wtf you said there always be a solution.");
    }
}
