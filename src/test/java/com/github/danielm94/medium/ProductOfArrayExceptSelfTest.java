package com.github.danielm94.medium;

import lombok.val;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ProductOfArrayExceptSelfTest {
    private ProductOfArrayExceptSelf product;

    @BeforeEach
    void setUp() {
        this.product = new ProductOfArrayExceptSelf();
    }

    @Test
    void example1() {
        val nums = new int[]{1, 2, 3, 4};
        val expected = new int[]{24, 12, 8, 6};
        val actual = product.productExceptSelf(nums);
        assertArrayEquals(expected, actual);
    }

    @Test
    void example2() {
        val nums = new int[]{-1, 1, 0, -3, 3};
        val expected = new int[]{0, 0, 9, 0, 0};
        val actual = product.productExceptSelf(nums);
        assertArrayEquals(expected, actual);
    }
}