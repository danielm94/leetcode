package com.github.danielm94.easy.twopointer;

import java.util.ArrayList;

public class ShortestDistanceToCharacter {

    public int[] shortestToChar(String s, char c) {
        var characterIndexList = new ArrayList<Integer>();
        for (var i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) characterIndexList.add(i);
        }

        var result = new int[s.length()];
        var curr = 0;
        var prev = 0;
        for (int i = 0; i < result.length; i++) {
            if (i > characterIndexList.get(curr)) {
                prev = curr;
                curr = Math.min(characterIndexList.size() - 1, curr + 1);
            }
            result[i] = Math.abs(Math.min(characterIndexList.get(curr) - i, i - characterIndexList.get(prev)));
        }

        return result;
    }
}
