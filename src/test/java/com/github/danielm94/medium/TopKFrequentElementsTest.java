package com.github.danielm94.medium;

import lombok.val;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementsTest {
    private TopKFrequentElements topK;

    @BeforeEach
    void setUp() {
        this.topK = new TopKFrequentElements();
    }

    @Test
    void topKFrequent1() {
        val nums = new int[]{1, 1, 1, 2, 2, 3};
        val k = 2;
        val expected = new int[]{1, 2};
        assertArrayEquals(expected, topK.topKFrequent(nums, k));
    }

    @Test
    void topKFrequent2() {
        val nums = new int[]{1};
        val k = 1;
        val expected = new int[]{1};
        assertArrayEquals(expected, topK.topKFrequent(nums, k));
    }

    @Test
    void topKFrequent3() {
        val nums = new int[]{5, 5, 5, 5, 5, 5, 5, 2, 2, 2, 34, 34, 34, 34, 34, 98};
        val k = 4;
        val expected = new int[]{5, 34, 2, 98};
        assertArrayEquals(expected, topK.topKFrequent(nums, k));
    }
}