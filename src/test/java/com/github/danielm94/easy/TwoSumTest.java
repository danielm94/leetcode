package com.github.danielm94.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    private TwoSum twoSum;

    @BeforeEach
    void setUp() {
        twoSum = new TwoSum();
    }

    @Test
    public void testExample1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }

    @Test
    public void testExample2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }

    @Test
    public void testExample3() {
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }

    @Test
    public void testExample4() {
        int[] nums = {1, 9, 8, 44, 51, 66, 72, 89, -4, 200};
        int target = 85;
        int[] expected = {7, 8};
        assertArrayEquals(expected, twoSum.twoSumImproved(nums, target));
    }
}