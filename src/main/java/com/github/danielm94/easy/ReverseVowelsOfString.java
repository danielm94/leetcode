package com.github.danielm94.easy;

public class ReverseVowelsOfString {
    public String reverseVowels(String s) {
        if (s == null || s.length() < 2) return s;
        var charArr = s.toCharArray();
        var left = 0;
        var right = s.length() - 1;
        while (left < right) {
            var leftChar = charArr[left];
            var rightChar = charArr[right];
            if (isVowel(leftChar) && isVowel(rightChar)) {
                charArr[left] = rightChar;
                charArr[right] = leftChar;
                right--;
                left++;
            } else if (isVowel(leftChar)) right--;
            else left++;
        }
        return new String(charArr);
    }

    private boolean isVowel(char c) {
        return c == 'A' || c == 'a' ||
                c == 'E' || c == 'e' ||
                c == 'I' || c == 'i' ||
                c == 'O' || c == 'o' ||
                c == 'U' || c == 'u';
    }
}
