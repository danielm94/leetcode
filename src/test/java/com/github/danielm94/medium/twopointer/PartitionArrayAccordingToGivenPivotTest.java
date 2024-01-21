package com.github.danielm94.medium.twopointer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PartitionArrayAccordingToGivenPivotTest {
    private PartitionArrayAccordingToGivenPivot solver;

    private boolean checkPartitioning(int[] nums, int pivot) {
        boolean foundPivot = false;
        for (int num : nums) {
            if (num > pivot) {
                foundPivot = true;
            } else if (num == pivot) {
                if (foundPivot) return false; // Pivot elements should not be found after elements greater than pivot
            } else {
                if (foundPivot)
                    return false; // Elements less than pivot should not be found after elements greater than pivot
            }
        }
        return true;
    }

    @BeforeEach
    void setUp() {
        solver = new PartitionArrayAccordingToGivenPivot();
    }

    @Test
    public void testPivotArrayExample1() {
        int[] nums = {9, 12, 5, 10, 14, 3, 10};
        int pivot = 10;
        int[] expected = {9, 5, 3, 10, 10, 12, 14};
        assertArrayEquals(expected, solver.pivotArray(nums, pivot));
        assertTrue(checkPartitioning(nums, pivot));
    }

    @Test
    public void testPivotArrayExample2() {
        int[] nums = {-3, 4, 3, 2};
        int pivot = 2;
        int[] expected = {-3, 2, 4, 3};
        assertArrayEquals(expected, solver.pivotArray(nums, pivot));
        assertTrue(checkPartitioning(nums, pivot));
    }

    @Test
    public void testPivotArrayAllSameElements() {
        int[] nums = {5, 5, 5, 5};
        int pivot = 5;
        int[] expected = {5, 5, 5, 5};
        assertArrayEquals(expected, solver.pivotArray(nums, pivot));
        assertTrue(checkPartitioning(nums, pivot));
    }

    @Test
    public void testPivotArrayEmpty() {
        int[] nums = {};
        int pivot = 0;
        int[] expected = {};
        assertArrayEquals(expected, solver.pivotArray(nums, pivot));
        assertTrue(checkPartitioning(nums, pivot));
    }

}