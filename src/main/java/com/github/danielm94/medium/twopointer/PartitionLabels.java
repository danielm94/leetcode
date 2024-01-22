package com.github.danielm94.medium.twopointer;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    private static int getCharIndex(char character) {
        return character - 'a';
    }

    private static void mapMaximumIndexOfEachCharacterToAnArray(String s, int[] maxCharacterIndexArray) {
        for (var i = 0; i < s.length(); i++) {
            var character = s.charAt(i);
            var charIndex = getCharIndex(character);
            maxCharacterIndexArray[charIndex] = Math.max(maxCharacterIndexArray[charIndex], i);
        }
    }

    public List<Integer> partitionLabels(String s) {
        var maxCharacterIndexArray = new int[26];
        mapMaximumIndexOfEachCharacterToAnArray(s, maxCharacterIndexArray);

        var result = new ArrayList<Integer>();

        for (int left = 0, right = 0; left < s.length(); ) {
            var prevMax = Integer.MIN_VALUE;
            var start = left;
            while (left <= right) {
                var character = s.charAt(left);
                var lookupIndex = getCharIndex(character);
                var maxIndex = maxCharacterIndexArray[lookupIndex];
                if (maxIndex > prevMax) {
                    right = maxIndex;
                    prevMax = maxIndex;
                }
                left++;
            }
            result.add(right - start + 1);
            right = left;
        }
        return result;
    }
}
