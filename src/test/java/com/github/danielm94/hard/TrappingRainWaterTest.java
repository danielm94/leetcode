package com.github.danielm94.hard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrappingRainWaterTest {
    private TrappingRainWater solver;

    @BeforeEach
    void setUp() {
        solver = new TrappingRainWater();
    }

    @Test
    public void testTrapExample1() {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int expected = 6;
        assertEquals(expected, solver.trap(height));
    }

    @Test
    public void testTrapExample2() {
        int[] height = {4, 2, 0, 3, 2, 5};
        int expected = 9;
        assertEquals(expected, solver.trap(height));
    }

    @Test
    public void testTrapExample3() {
        int[] height = {4, 2, 3};
        int expected = 1;
        assertEquals(expected, solver.trap(height));
    }

    // Additional test cases can be added here

    // Example: Testing with an empty array
    // @Test
    // public void testTrapEmptyArray() {
    //     TrappingRainWater solver = new TrappingRainWater();
    //     int[] height = {};
    //     int expected = 0; // Assuming the expected result for an empty array is 0
    //     assertEquals(expected, solver.trap(height));
    // }

    // Example: Testing with an array where all elements are the same
    // @Test
    // public void testTrapUniformHeight() {
    //     TrappingRainWater solver = new TrappingRainWater();
    //     int[] height = {3,3,3,3,3};
    //     int expected = 0; // No water can be trapped if all bars are of the same height
    //     assertEquals(expected, solver.trap(height));
    // }
}
