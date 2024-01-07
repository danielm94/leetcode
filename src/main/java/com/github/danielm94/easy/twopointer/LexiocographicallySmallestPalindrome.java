package com.github.danielm94.easy.twopointer;

public class LexiocographicallySmallestPalindrome {

    public String makeSmallestPalindrome(String s) {
        if (s == null || s.length() == 1) return s;
        var charArr = s.toCharArray();

        for (int left = 0, right = s.length() - 1; left < right; left++, right--) {
            var leftChar = charArr[left];
            var rightChar = charArr[right];
            if (leftChar > rightChar) {
                charArr[left] = rightChar;
            } else if (leftChar < rightChar) {
                charArr[right] = leftChar;
            }
        }
        return new String(charArr);
    }
}
