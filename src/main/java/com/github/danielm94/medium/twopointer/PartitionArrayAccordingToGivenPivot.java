package com.github.danielm94.medium.twopointer;

import java.util.ArrayList;

public class PartitionArrayAccordingToGivenPivot {

    public int[] pivotArray(int[] nums, int pivot) {
        var pivotCount = 0;
        var lessThanCount = 0;


        for (var num : nums) {
            if (num == pivot) pivotCount++;
            else if (num < pivot) lessThanCount++;
        }

        var lessThanIndex = 0;
        var pivotIndex = lessThanIndex + lessThanCount;
        var greaterThanIndex = pivotIndex + pivotCount;

        var result = new int[nums.length];

        for (var value : nums) {
            if (value == pivot) result[pivotIndex++] = value;
            else if (value < pivot) result[lessThanIndex++] = value;
            else result[greaterThanIndex++] = value;
        }
        return result;
    }

    public int[] pivotArrayWithLists(int[] nums, int pivot) {
        var lessThanList = new ArrayList<Integer>();
        var greaterThanList = new ArrayList<Integer>();
        var pivotCount = 0;

        for (var num : nums) {
            if (num == pivot) pivotCount++;
            else if (num > pivot) greaterThanList.add(num);
            else lessThanList.add(num);
        }

        var result = new int[nums.length];
        var resultPointer = 0;

        for (var num : lessThanList) {
            result[resultPointer++] = num;
        }

        for (var i = resultPointer; i < resultPointer + pivotCount; i++) {
            result[i] = pivot;
        }
        resultPointer += pivotCount;

        for (var num : greaterThanList) {
            result[resultPointer++] = num;
        }

        return result;
    }

}
