package com.github.danielm94.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumSortedArrayTest {

    @Test
    public void testTwoSumExample1() {
        TwoSumSortedArray solver = new TwoSumSortedArray();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] expectedResult = {1, 2};
        assertArrayEquals(expectedResult, solver.twoSum(numbers, target));
    }

    @Test
    public void testTwoSumExample2() {
        TwoSumSortedArray solver = new TwoSumSortedArray();
        int[] numbers = {2, 3, 4};
        int target = 6;
        int[] expectedResult = {1, 3};
        assertArrayEquals(expectedResult, solver.twoSum(numbers, target));
    }

    @Test
    public void testTwoSumExample3() {
        TwoSumSortedArray solver = new TwoSumSortedArray();
        int[] numbers = {-1, 0};
        int target = -1;
        int[] expectedResult = {1, 2};
        assertArrayEquals(expectedResult, solver.twoSum(numbers, target));
    }

    @Test
    public void testTwoSumEdgeCase() {
        TwoSumSortedArray solver = new TwoSumSortedArray();
        int[] numbers = {-1000, 1000};
        int target = 0;
        int[] expectedResult = {1, 2};
        assertArrayEquals(expectedResult, solver.twoSum(numbers, target));
    }

    @Test
    public void testTwoSumExample4() {
        TwoSumSortedArray solver = new TwoSumSortedArray();
        int[] numbers = {0, 2, 4, 5, 6, 9, 10, 15, 60};
        int target = 65;
        int[] expectedResult = {4, 9};
        assertArrayEquals(expectedResult, solver.twoSum(numbers, target));
    }
    // Additional test cases can be added here to cover more scenarios
}
