package com.github.danielm94.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArithmeticTripletsTest {

    private ArithmeticTriplets arithmeticTriplets;

    @BeforeEach
    void setUp() {
        arithmeticTriplets = new ArithmeticTriplets();
    }

    @Test
    public void testArithmeticTripletsExample1() {
        ArithmeticTriplets tripletFinder = new ArithmeticTriplets();
        int[] nums = {0, 1, 4, 6, 7, 10};
        int diff = 3;
        int expected = 2;
        assertEquals(expected, tripletFinder.arithmeticTriplets(nums, diff));
    }

    @Test
    public void testArithmeticTripletsExample2() {
        ArithmeticTriplets tripletFinder = new ArithmeticTriplets();
        int[] nums = {4, 5, 6, 7, 8, 9};
        int diff = 2;
        int expected = 2;
        assertEquals(expected, tripletFinder.arithmeticTriplets(nums, diff));
    }
}