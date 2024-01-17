package com.github.danielm94.easy.twopointer;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayByParity2 {
    public int[] sortArrayByParityII(int[] nums) {
        var oddList = new ArrayList<Integer>();
        var evenList = new ArrayList<Integer>();

        for (var num : nums) {
            if (num % 2 == 0) evenList.add(num);
            else oddList.add(num);
        }

        Collections.sort(oddList);
        Collections.sort(evenList);

        for (int i = 0, oddPointer = 0, evenPointer = 0; i < nums.length; i++) {
            nums[i] = i % 2 == 0 ? evenList.get(evenPointer++) : oddList.get(oddPointer++);
        }

        return nums;
    }
}
