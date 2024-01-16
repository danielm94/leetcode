package com.github.danielm94.medium;

import java.util.*;

public class ThreeSum {
    //TODO:SOLVE THIS PROPERLY
    public List<List<Integer>> threeSum(int[] nums) {
        var result = new ArrayList<List<Integer>>();
        var indexSet = new HashSet<List<Integer>>();
        var valueSet = new HashSet<List<Integer>>();

        for (var i = 0; i < nums.length; i++) {
            var map = new HashMap<Integer, Integer>();
            var target = -nums[i];
            for (var j = i + 1; j < nums.length; j++) {
                int complement = target - nums[j];
                if (map.containsKey(complement)) {
                    var k = map.get(complement);
                    var indexList = new ArrayList<>(List.of(i, j, k));
                    Collections.sort(indexList);
                    if (!indexSet.add(indexList)) continue;
                    var valueList = new ArrayList<>(List.of(nums[i], nums[j], nums[k]));
                    Collections.sort(valueList);
                    if (!valueSet.add(valueList)) continue;
                    result.add(valueList);
                }
                map.put(nums[j], j);
            }
        }
        return result;
    }
}
