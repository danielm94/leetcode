package com.github.danielm94.hard.twopointer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxScoreOfGoodSubarrayTest {

    private MaxScoreOfGoodSubarray solver;

    @BeforeEach
    void setUp() {
        solver = new MaxScoreOfGoodSubarray();
    }

    @Test
    public void testMaximumScoreExample1() {
        int[] nums = {1, 4, 3, 7, 4, 5};
        int k = 3;
        int expected = 15;
        assertEquals(expected, solver.maximumScore(nums, k));
    }

    @Test
    public void testMaximumScoreExample2() {
        int[] nums = {5, 5, 4, 5, 4, 1, 1, 1};
        int k = 0;
        int expected = 20;
        assertEquals(expected, solver.maximumScore(nums, k));
    }

    @Test
    public void testMaximumScoreAllSameElements() {
        int[] nums = {7, 7, 7, 7, 7, 7, 7};
        int k = 3;
        int expected = 7 * nums.length;
        assertEquals(expected, solver.maximumScore(nums, k));
    }

    @Test
    public void testMaximumScoreFailed() {
        int[] nums = {6569, 9667, 3148, 7698, 1622, 2194, 793, 9041, 1670, 1872};
        int k = 5;
        int expected = 9732;
        assertEquals(expected, solver.maximumScore(nums, k));
    }

    @Test
    public void testMaximumScoreSingleElement() {
        int[] nums = {10};
        int k = 0;
        int expected = 10;
        assertEquals(expected, solver.maximumScore(nums, k));
    }

}
