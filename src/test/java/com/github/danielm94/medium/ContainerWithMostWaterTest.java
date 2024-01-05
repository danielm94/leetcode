package com.github.danielm94.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainerWithMostWaterTest {

    private ContainerWithMostWater solver;

    @BeforeEach
    void setUp() {
        solver = new ContainerWithMostWater();
    }

    @Test
    public void testMaxAreaExample1() {
        solver = new ContainerWithMostWater();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected = 49;
        assertEquals(expected, solver.maxArea(height));
    }

    @Test
    public void testMaxAreaExample2() {
        solver = new ContainerWithMostWater();
        int[] height = {1, 1};
        int expected = 1;
        assertEquals(expected, solver.maxArea(height));
    }

    // Additional test cases can be added here

    // Example: Testing with an empty array
    // @Test
    // public void testMaxAreaEmptyArray() {
    //     ContainerWithMostWater solver = new ContainerWithMostWater();
    //     int[] height = {};
    //     int expected = 0; // Assuming the expected result for an empty array is 0
    //     assertEquals(expected, solver.maxArea(height));
    // }
}
