package com.github.danielm94.easy.twopointer;

public class FirstPalindromicString {
    public String firstPalindrome(String[] words) {
        for (var word : words) {
            if (isPalindrome(word)) return word;
        }
        return "";
    }

    private boolean isPalindrome(String word) {
        for (int left = 0, right = word.length() - 1; left < right; left++, right--) {
            if (word.charAt(left) != word.charAt(right)) return false;
        }
        return true;
    }
}
