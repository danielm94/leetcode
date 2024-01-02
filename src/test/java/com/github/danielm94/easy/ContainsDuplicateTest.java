package com.github.danielm94.easy;

import lombok.val;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {
    private ContainsDuplicate containsDuplicate;

    @BeforeEach
    void setUp() {
        containsDuplicate = new ContainsDuplicate();
    }

    @Test
    void example1() {
        val nums = new int[]{1, 2, 3, 1};
        val result = containsDuplicate.containsDuplicate(nums);
        assertTrue(result);
    }

    @Test
    void example2() {
        val nums = new int[]{1,2,3,4};
        val result = containsDuplicate.containsDuplicate(nums);
        assertFalse(result);
    }
    @Test
    void example3() {
        val nums = new int[]{1,1,1,3,3,4,3,2,4,2};
        val result = containsDuplicate.containsDuplicate(nums);
        assertTrue(result);
    }
}