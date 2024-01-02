package com.github.danielm94.medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        var countMap = new HashMap<Integer, Integer>();
        for (var num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        var listOfCountNumberArrays = new ArrayList<int[]>();
        for (var key : countMap.keySet()) {
            listOfCountNumberArrays.add(new int[]{countMap.get(key), key});
        }

        listOfCountNumberArrays.sort((array1, array2) -> Integer.compare(array2[0], array1[0]));

        var result = new int[k];
        for (int i = 0; i < result.length; i++) {
            result[i] = listOfCountNumberArrays.get(i)[1];
        }

        return result;
    }
}
