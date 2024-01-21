package com.github.danielm94.easy.twopointer;

import java.util.Arrays;

public class FindTheDistanceValueBetweenTwoArrays {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        var count = 0;
        Arrays.sort(arr2);

        for (var num : arr1) {
            if (!containsNumberInRangeOfD(arr2, num - d, num + d)) count++;
        }

        return count;
    }

    private boolean containsNumberInRangeOfD(int[] arr, int min, int max) {
        var left = 0;
        var right = arr.length - 1;

        while (left <= right) {
            var mid = left + (right - left) / 2;
            var midVal = arr[mid];
            if (midVal >= min && midVal <= max) return true;
            else if (midVal < min) left = mid + 1;
            else right = mid - 1;
        }

        return false;
    }
}
