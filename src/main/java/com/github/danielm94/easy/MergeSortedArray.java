package com.github.danielm94.easy;

public class MergeSortedArray {
    /**
     * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
     * representing the number of elements in nums1 and nums2 respectively.
     * <p>
     * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
     * <p>
     * The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n,
     * where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge2MPlusNComplexity(int[] nums1, int m, int[] nums2, int n) {
        var left = 0;
        var right = 0;

        var tempArr = new int[m + n];
        while (left < m && right < n) {
            var value1 = nums1[left];
            var value2 = nums2[right];
            if (value1 <= value2) {
                tempArr[left + right] = value1;
                left++;
            } else {
                tempArr[left + right] = value2;
                right++;
            }
        }

        if (left < m) {
            for (var i = left + right; left < m; i++, left++) {
                tempArr[i] = nums1[left];
            }
        }

        if (right < n) {
            for (var i = left + right; right < n; i++, right++) {
                tempArr[i] = nums2[right];
            }
        }

        for (var i = 0; i < nums1.length; i++) {
            nums1[i] = tempArr[i];
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        var nums1Pointer = m - 1;
        var nums2Pointer = n - 1;
        var overWritePointer = m + n - 1;

        while (overWritePointer >= 0) {
            if (nums1Pointer < 0) {
                nums1[overWritePointer] = nums2[nums2Pointer--];
            } else if (nums2Pointer < 0) {
                nums1[overWritePointer] = nums1[nums1Pointer--];
            } else if (nums1[nums1Pointer] >= nums2[nums2Pointer]) {
                nums1[overWritePointer] = nums1[nums1Pointer--];
            } else {
                nums1[overWritePointer] = nums2[nums2Pointer--];
            }
            overWritePointer--;
        }
    }
}
