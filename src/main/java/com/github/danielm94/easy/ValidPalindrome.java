package com.github.danielm94.easy;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = sanitizeString(s);
        if (s == null) return true;
        var sCharArr = s.toCharArray();
        var left = 0;
        var right = sCharArr.length - 1;

        while (left < right) {
            if (sCharArr[left++] != sCharArr[right--]) return false;
        }
        return true;
    }

    private String sanitizeString(String s) {
        if (s == null || s.isEmpty() || s.isBlank()) return null;
        var builder = new StringBuilder();
        for (var character : s.toCharArray()) {
            if (Character.isLetterOrDigit(character)) builder.append(Character.toLowerCase(character));
        }
        return builder.toString();
    }


}
