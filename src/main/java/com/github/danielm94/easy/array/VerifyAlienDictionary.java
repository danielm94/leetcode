package com.github.danielm94.easy.array;

import java.util.HashMap;

public class VerifyAlienDictionary {
    public boolean isAlienSorted(String[] words, String order) {
        if (words == null || words.length == 1) return true;

        var orderMap = new HashMap<Character, Integer>();
        var charArr = order.toCharArray();

        for (var i = 0; i < charArr.length; i++) {
            orderMap.put(charArr[i], i);
        }

        var prevWord = words[0];
        for (var i = 1; i < words.length; i++) {
            var currWord = words[i];
            var currWordIsGreater = false;
            for (var j = 0; j < Math.min(prevWord.length(), currWord.length()); j++) {
                var prevWordCharOrder = orderMap.get(prevWord.charAt(j));
                var currWordCharOrder = orderMap.get(currWord.charAt(j));
                if (prevWordCharOrder > currWordCharOrder) return false;
                else if (prevWordCharOrder < currWordCharOrder) {
                    currWordIsGreater = true;
                    break;
                }
            }
            if (prevWord.length() > currWord.length() && !currWordIsGreater) return false;
            prevWord = currWord;
        }
        return true;
    }
}
