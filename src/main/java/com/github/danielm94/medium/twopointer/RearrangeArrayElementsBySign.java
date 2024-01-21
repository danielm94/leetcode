package com.github.danielm94.medium.twopointer;

public class RearrangeArrayElementsBySign {
    public int[] rearrangeArray(int[] nums) {
        var positivePointer = 0;
        var negativePointer = 1;
        var result = new int[nums.length];

        for (int num : nums) {
            if (num >= 0) {
                result[positivePointer] = num;
                positivePointer += 2;
            } else {
                result[negativePointer] = num;
                negativePointer += 2;
            }
        }

        return result;
    }
}
