package com.github.danielm94.easy.twopointer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheArrayConcatenationValueTest {

    private FindTheArrayConcatenationValue solver;

    @BeforeEach
    void setUp() {
        solver = new FindTheArrayConcatenationValue();
    }

    @Test
    public void testFindTheArrayConcValExample1() {
        int[] nums = {7, 52, 2, 4};
        long expected = 596L;
        assertEquals(expected, solver.findTheArrayConcVal(nums));
    }

    @Test
    public void testFindTheArrayConcValExample2() {
        int[] nums = {5, 14, 13, 8, 12};
        long expected = 673L;
        assertEquals(expected, solver.findTheArrayConcVal(nums));
    }

    @Test
    public void testFindTheArrayConcValSingleElement() {
        int[] nums = {123};
        long expected = 123L;
        assertEquals(expected, solver.findTheArrayConcVal(nums));
    }

    @Test
    public void testFindTheArrayConcValTwoElements() {
        int[] nums = {1, 2};
        long expected = 12L;
        assertEquals(expected, solver.findTheArrayConcVal(nums));
    }

    @Test
    public void testFindTheArrayConcValLargeNumbers() {
        int[] nums = {10000, 9999, 10000, 9999};
        long expected = 100009999L + 999910000L;
        assertEquals(expected, solver.findTheArrayConcVal(nums));
    }

}
