package com.github.danielm94.medium;

import lombok.val;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumProductSubArrayTest {

    private MaximumProductSubArray maxProduct;

    @BeforeEach
    void setUp() {
        maxProduct = new MaximumProductSubArray();
    }

    @Test
    void maxProductBruteForce() {
        val input = new int[]{-2, 3, -4};
        val expected = 24;
        val actual = maxProduct.maxProductBruteForce(input);
        assertEquals(expected, actual);
    }

    @Test
    void maxProductBruteForce2() {
        val input = new int[]{2, 3, -2, 4};
        val expected = 6;
        val actual = maxProduct.maxProductBruteForce(input);
        assertEquals(expected, actual);
    }

    @Test
    void maxProductBruteForce3() {
        val input = new int[]{-2, 0, -1};
        val expected = 0;
        val actual = maxProduct.maxProductBruteForce(input);
        assertEquals(expected, actual);
    }

    @Test
    void maxProductBetter1() {
        val input = new int[]{-2, 3, -4};
        val expected = 24;
        val actual = maxProduct.maxProductBetter(input);
        assertEquals(expected, actual);
    }

    @Test
    void maxProductBetter2() {
        val input = new int[]{-2, 0, -1};
        val expected = 0;
        val actual = maxProduct.maxProductBetter(input);
        assertEquals(expected, actual);
    }

    @Test
    void maxProductBetter3() {
        val input = new int[]{2, 3, -2, 4};
        val expected = 6;
        val actual = maxProduct.maxProductBetter(input);
        assertEquals(expected, actual);
    }

    @Test
    void maxProductBetter4() {
        val input = new int[]{0, 2};
        val expected = 2;
        val actual = maxProduct.maxProductBetter(input);
        assertEquals(expected, actual);
    }
}