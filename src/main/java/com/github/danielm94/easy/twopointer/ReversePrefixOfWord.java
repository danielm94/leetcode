package com.github.danielm94.easy.twopointer;

public class ReversePrefixOfWord {

    public String reversePrefix(String word, char ch) {
        if (word == null || word.length() == 1) return word;
        var charArr = word.toCharArray();

        var left = 0;
        var right = Math.max(0, word.indexOf(ch));

        while (left < right) {
            var temp = charArr[left];
            charArr[left++] = charArr[right];
            charArr[right--] = temp;
        }

        return new String(charArr);
    }
}
