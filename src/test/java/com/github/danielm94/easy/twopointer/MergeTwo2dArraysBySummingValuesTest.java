package com.github.danielm94.easy.twopointer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeTwo2dArraysBySummingValuesTest {
    private MergeTwo2dArraysBySummingValues merger;

    @BeforeEach
    void setUp() {
        merger = new MergeTwo2dArraysBySummingValues();
    }

    @Test
    public void testMergeArraysExample1() {
        int[][] nums1 = {{1, 2}, {2, 3}, {4, 5}};
        int[][] nums2 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] expected = {{1, 6}, {2, 3}, {3, 2}, {4, 6}};
        assertArrayEquals(expected, merger.mergeArrays(nums1, nums2));
    }

    @Test
    public void testMergeArraysExample2() {
        int[][] nums1 = {{2, 4}, {3, 6}, {5, 5}};
        int[][] nums2 = {{1, 3}, {4, 3}};
        int[][] expected = {{1, 3}, {2, 4}, {3, 6}, {4, 3}, {5, 5}};
        assertArrayEquals(expected, merger.mergeArrays(nums1, nums2));
    }

    @Test
    public void testMergeArraysEmptyFirstArray() {
        int[][] nums1 = {};
        int[][] nums2 = {{1, 3}, {4, 3}};
        int[][] expected = {{1, 3}, {4, 3}};
        assertArrayEquals(expected, merger.mergeArrays(nums1, nums2));
    }

    @Test
    public void testMergeArraysEmptySecondArray() {
        int[][] nums1 = {{2, 4}, {3, 6}};
        int[][] nums2 = {};
        int[][] expected = {{2, 4}, {3, 6}};
        assertArrayEquals(expected, merger.mergeArrays(nums1, nums2));
    }

}