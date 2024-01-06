package com.github.danielm94.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortedArrayTest {
    private MergeSortedArray merger;

    @BeforeEach
    void setUp() {
        merger = new MergeSortedArray();
    }

    @Test
    public void testMergeExample1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;
        merger.merge(nums1, m, nums2, n);
        int[] expected = {1, 2, 2, 3, 5, 6};
        assertArrayEquals(expected, nums1);
    }

    @Test
    public void testMergeExample2() {
        int[] nums1 = {1};
        int[] nums2 = {};
        int m = 1, n = 0;
        merger.merge(nums1, m, nums2, n);
        int[] expected = {1};
        assertArrayEquals(expected, nums1);
    }

    @Test
    public void testMergeExample3() {
        int[] nums1 = {0};
        int[] nums2 = {1};
        int m = 0, n = 1;
        merger.merge(nums1, m, nums2, n);
        int[] expected = {1};
        assertArrayEquals(expected, nums1);
    }
}