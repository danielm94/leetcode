package com.github.danielm94.easy.twopointer;

import com.github.danielm94.util.TreeNodeUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TwoSumBSTTest {

    private TwoSumBST twoSum;

    @BeforeEach
    void setUp() {
        twoSum = new TwoSumBST();
    }

    @Test
    void example1() {
        var tree = TreeNodeUtil.getBSTFromIntegerListIteration(Arrays.asList(5, 3, 6, 2, 4, null, 7));
        assertTrue(twoSum.findTarget(tree, 9));
    }

    @Test
    void example2() {
        var tree = TreeNodeUtil.getBSTFromIntegerListIteration(List.of(5, 3, 6, 2, 4, null, 7));
        assertFalse(twoSum.findTarget(tree, 28));
    }
}