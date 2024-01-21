package com.github.danielm94.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestPositiveIntegerThatExistsWithItsNegativeTest {

    private LargestPositiveIntegerThatExistsWithItsNegative solver;

    @BeforeEach
    void setUp() {
        solver = new LargestPositiveIntegerThatExistsWithItsNegative();
    }

    @Test
    public void testFindMaxKExample1() {
        int[] nums = {-1, 2, -3, 3};
        int expected = 3;
        assertEquals(expected, solver.findMaxK(nums));
    }

    @Test
    public void testFindMaxKExample2() {
        int[] nums = {-1, 10, 6, 7, -7, 1};
        int expected = 7;
        assertEquals(expected, solver.findMaxK(nums));
    }

    @Test
    public void testFindMaxKExample3() {
        int[] nums = {-10, 8, 6, 7, -2, -3};
        int expected = -1;
        assertEquals(expected, solver.findMaxK(nums));
    }

    @Test
    public void testFindMaxKNoNegatives() {
        int[] nums = {1, 2, 3, 4, 5};
        int expected = -1;
        assertEquals(expected, solver.findMaxK(nums));
    }

    @Test
    public void testFindMaxKAllNegatives() {
        int[] nums = {-1, -2, -3, -4, -5};
        int expected = -1;
        assertEquals(expected, solver.findMaxK(nums));
    }

    // Additional test cases can be added here to cover more scenarios, such as arrays with a single element, large arrays, etc.
}
