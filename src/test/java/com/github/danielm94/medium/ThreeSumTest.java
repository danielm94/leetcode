package com.github.danielm94.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ThreeSumTest {
    private ThreeSum solver = new ThreeSum();

    @Test
    public void testThreeSumExample1() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1)
        );
        List<List<Integer>> result = solver.threeSum(nums);
        for (List<Integer> triplet : result) {
            Collections.sort(triplet);
        }
        assertTrue(expected.containsAll(result) && result.containsAll(expected));
    }

    @Test
    public void testThreeSumExample2() {
        int[] nums = {0, 1, 1};
        List<List<Integer>> expected = List.of();
        assertEquals(expected, solver.threeSum(nums));
    }

    @Test
    public void testThreeSumExample3() {
        int[] nums = {0, 0, 0};
        List<List<Integer>> expected = List.of(
                Arrays.asList(0, 0, 0)
        );
        assertEquals(expected, solver.threeSum(nums));
    }

    @Test
    public void testThreeSumNoSolution() {
        int[] nums = {1, 2, -2, -1};
        List<List<Integer>> expected = List.of();
        assertEquals(expected, solver.threeSum(nums));
    }
}
