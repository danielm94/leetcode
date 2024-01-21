package com.github.danielm94.medium.twopointer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RearrangeArrayElementsBySignTest {

    private RearrangeArrayElementsBySign rearranger;

    private boolean verifyConditions(int[] nums) {
        if (nums[0] < 0) return false; // First element must be positive

        for (int i = 0; i < nums.length - 1; i++) {
            if (Math.signum(nums[i]) == Math.signum(nums[i + 1]))
                return false; // Consecutive elements must have opposite signs
        }

        return true;
    }

    @BeforeEach
    void setUp() {
        rearranger = new RearrangeArrayElementsBySign();
    }

    @Test
    public void testRearrangeArrayExample1() {
        int[] nums = {3, 1, -2, -5, 2, -4};
        int[] expected = {3, -2, 1, -5, 2, -4};
        assertArrayEquals(expected, rearranger.rearrangeArray(nums));
        assertTrue(verifyConditions(rearranger.rearrangeArray(nums)));
    }

    @Test
    public void testRearrangeArrayExample2() {
        int[] nums = {-1, 1};
        int[] expected = {1, -1};
        assertArrayEquals(expected, rearranger.rearrangeArray(nums));
        assertTrue(verifyConditions(rearranger.rearrangeArray(nums)));
    }

    @Test
    public void testRearrangeArrayAlternatingSigns() {
        int[] nums = {1, -1, 2, -2, 3, -3};
        int[] expected = {1, -1, 2, -2, 3, -3};
        assertArrayEquals(expected, rearranger.rearrangeArray(nums));
        assertTrue(verifyConditions(rearranger.rearrangeArray(nums)));
    }
}
