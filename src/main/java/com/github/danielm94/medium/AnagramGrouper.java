package com.github.danielm94.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnagramGrouper {
    public List<List<String>> groupAnagrams(String[] strs) {
        var solution = new ArrayList<List<String>>();
        if (strs.length == 0) return solution;
        var map = new HashMap<String, List<String>>();
        for (var string : strs) {
            var charArr = string.toCharArray();
            Arrays.sort(charArr);
            var sortedString = new String(charArr);
            map.computeIfAbsent(sortedString, k -> new ArrayList<>());
            var list = map.get(sortedString);
            list.add(string);
        }
        for (var key : map.keySet()) {
            solution.add(map.get(key));
        }
        return solution;
    }
}
