package com.github.danielm94.easy;

public class ReverseWordsInString3 {
    public String reverseWords(String s) {
        if (s == null || s.length() == 1) return s;
        var left = 0;
        var right = 0;
        var charArr = s.toCharArray();
        var length = s.length();
        while (right < length) {
            var rightChar = charArr[right];
            if (Character.isWhitespace(rightChar)) {
                reverseCharactersInSubArray(charArr, left, right - 1);
                right++;
                left = right;
            } else {
                right++;
            }
        }

        reverseCharactersInSubArray(charArr, left, right - 1);
        return new String(charArr);
    }

    private void reverseCharactersInSubArray(char[] array, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            var temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
