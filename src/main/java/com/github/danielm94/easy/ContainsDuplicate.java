package com.github.danielm94.easy;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        var set = new HashSet<Integer>();
        for (int num : nums) {
            if (!set.add(num)) return true;
        }
        return false;
    }
}
