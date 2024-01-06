package com.github.danielm94.easy;

import lombok.val;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountPairsSumLessThanTargetTest {

    private CountPairsSumLessThanTarget counter;

    @BeforeEach
    void setUp() {
        counter = new CountPairsSumLessThanTarget();
    }

    @Test
    public void testCountPairsExample1() {
        val nums = Arrays.asList(-1, 1, 2, 3, 1);
        val target = 2;
        val expected = 3;
        assertEquals(expected, counter.countPairs(nums, target));
    }

    @Test
    public void testCountPairsExample2() {
        val nums = Arrays.asList(-6, 2, 5, -2, -7, -1, 3);
        val target = -2;
        val expected = 10;
        assertEquals(expected, counter.countPairs(nums, target));
    }
}