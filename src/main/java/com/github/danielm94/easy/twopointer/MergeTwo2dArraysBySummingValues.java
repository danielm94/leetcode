package com.github.danielm94.easy.twopointer;

public class MergeTwo2dArraysBySummingValues {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        var temp = new int[nums1.length + nums2.length][2];
        var nums1Pointer = 0;
        var nums2Pointer = 0;
        var resultPointer = 0;
        var numberOfSameIds = 0;

        while (nums1Pointer < nums1.length && nums2Pointer < nums2.length) {
            var nums1Id = nums1[nums1Pointer][0];
            var nums2Id = nums2[nums2Pointer][0];
            if (nums1Id == nums2Id) {
                temp[resultPointer][0] = nums1Id;
                temp[resultPointer++][1] = nums1[nums1Pointer++][1] + nums2[nums2Pointer++][1];
                numberOfSameIds++;
            } else if (nums1Id < nums2Id) {
                temp[resultPointer][0] = nums1Id;
                temp[resultPointer++][1] = nums1[nums1Pointer++][1];
            } else {
                temp[resultPointer][0] = nums2Id;
                temp[resultPointer++][1] = nums2[nums2Pointer++][1];
            }
        }

        while (nums1Pointer < nums1.length) {
            temp[resultPointer][0] = nums1[nums1Pointer][0];
            temp[resultPointer++][1] = nums1[nums1Pointer++][1];
        }

        while (nums2Pointer < nums2.length) {
            temp[resultPointer][0] = nums2[nums2Pointer][0];
            temp[resultPointer++][1] = nums2[nums2Pointer++][1];
        }

        var result = new int[temp.length - numberOfSameIds][temp[0].length];

        System.arraycopy(temp, 0, result, 0, result.length);

        return result;
    }
}
