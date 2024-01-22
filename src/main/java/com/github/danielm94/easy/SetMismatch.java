package com.github.danielm94.easy;

import java.util.Arrays;
import java.util.HashSet;

public class SetMismatch {
    public static void main(String[] args) {
        var res = new SetMismatch().findErrorNums(new int[]{1, 2, 2, 4});
        System.out.println(Arrays.toString(res));
    }

    public int[] findErrorNums(int[] nums) {
        var n = nums.length;
        var set = new HashSet<Integer>();

        var actualSum = 0;
        var duplicate = -1;

        for (var num : nums) {
            if (!set.add(num)) duplicate = num;
            actualSum += num;
        }

        var expectedSum = n * (n + 1) / 2;
        return new int[]{duplicate, expectedSum - (actualSum - duplicate)};
    }
}
