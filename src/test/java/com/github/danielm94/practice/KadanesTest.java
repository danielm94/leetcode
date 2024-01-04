package com.github.danielm94.practice;

import lombok.val;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KadanesTest {
    private Kadanes kadanes;

    @BeforeEach
    void setUp() {
        kadanes = new Kadanes();
    }

    @Test
    void largestSubArrayBruteForce() {
        val input = new int[]{4, -1, 2, -7, 3, 4};
        val expected = 7;
        val actual = kadanes.largestSubArrayBruteForce(input);
        assertEquals(expected, actual);
    }

    @Test
    void largestSubArrayTest() {
        val input = new int[]{4, -1, 2, -7, 3, 4};
        val expected = 7;
        val actual = kadanes.largestSubArrayKadanes(input);
        assertEquals(expected, actual);
    }

    @Test
    void largestSubArrayTest2() {
        val input = new int[]{-1, -70, -72, -75, -100, -200};
        val expected = -1;
        val actual = kadanes.largestSubArrayKadanes(input);
        assertEquals(expected, actual);
    }
}