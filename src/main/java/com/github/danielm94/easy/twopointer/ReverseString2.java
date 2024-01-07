package com.github.danielm94.easy.twopointer;

public class ReverseString2 {
    public String reverseStr(String s, int k) {
        if (s == null || s.length() == 1) return s;
        var charArr = s.toCharArray();
        for (var i = 0; i < s.length(); i += 2 * k) {
            reverseSubArray(charArr, i, i + k - 1);
        }
        return new String(charArr);
    }

    private void reverseSubArray(char[] arr, int start, int end) {
        start = Math.min(start, arr.length - 1);
        end = Math.min(end, arr.length - 1);
        while (start < end) {
            var temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }
}
