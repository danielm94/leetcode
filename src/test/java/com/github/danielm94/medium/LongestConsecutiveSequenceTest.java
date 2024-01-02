package com.github.danielm94.medium;

import lombok.val;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestConsecutiveSequenceTest {
    private LongestConsecutiveSequence sequence;

    @BeforeEach
    void setUp() {
        sequence = new LongestConsecutiveSequence();
    }

    @Test
    void example1() {
        val nums = new int[]{100, 4, 200, 1, 3, 2};
        val result = sequence.longestConsecutive(nums);
        assertEquals(4, result);
    }

    @Test
    void example2() {
        val nums = new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        val result = sequence.longestConsecutive(nums);
        assertEquals(9, result);
    }
}