package com.github.danielm94.easy.twopointer;

public class RemovePalindromicSubsequences {
    //TODO: SOLVE THIS, YOU FAILED
    public int removePalindromeSub(String s) {
        var count = 0;
        var left = 0;
        var right = s.length() - 1;
        while (left < right) {
            var leftChar = s.charAt(left);
            var rightChar = s.charAt(right);
            if (leftChar == rightChar) {
                left++;
                right--;
            } else if (s.charAt(left + 1) == rightChar) {
                left++;
                count++;
            } else if (s.charAt(right - 1) == leftChar) {
                right--;
                count++;
            }
        }

        return ++count;
    }
}
