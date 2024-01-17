package com.github.danielm94.easy.twopointer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SortArrayByParity2Test {
    private SortArrayByParity2 sorter;

    private boolean isSortedByParity(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0 && nums[i] % 2 != 0 || i % 2 != 0 && nums[i] % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    @BeforeEach
    void setUp() {
        sorter = new SortArrayByParity2();
    }

    @Test
    public void testSortArrayByParityIIExample1() {
        int[] nums = {4, 2, 5, 7};
        int[] result = sorter.sortArrayByParityII(nums);
        assertTrue(isSortedByParity(result));
    }

    @Test
    public void testSortArrayByParityIIExample2() {
        int[] nums = {2, 3};
        int[] result = sorter.sortArrayByParityII(nums);
        assertTrue(isSortedByParity(result));
    }

    @Test
    public void testSortArrayByParityIILargerArray() {
        int[] nums = {1, 4, 3, 2, 5, 6};
        int[] result = sorter.sortArrayByParityII(nums);
        assertTrue(isSortedByParity(result));
    }

    @Test
    public void testSortArrayByParityIIAllZeros() {
        int[] nums = {0, 0, 0, 0};
        int[] result = sorter.sortArrayByParityII(nums);
        assertTrue(isSortedByParity(result));
    }
}