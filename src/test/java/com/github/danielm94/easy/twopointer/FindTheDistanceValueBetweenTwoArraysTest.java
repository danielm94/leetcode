package com.github.danielm94.easy.twopointer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheDistanceValueBetweenTwoArraysTest {

    private FindTheDistanceValueBetweenTwoArrays solver;

    @BeforeEach
    void setUp() {
        solver = new FindTheDistanceValueBetweenTwoArrays();
    }

    @Test
    public void testFindTheDistanceValueExample1() {
        int[] arr1 = {4, 5, 8};
        int[] arr2 = {10, 9, 1, 8};
        int d = 2;
        int expected = 2;
        assertEquals(expected, solver.findTheDistanceValue(arr1, arr2, d));
    }

    @Test
    public void testFindTheDistanceValueExample2() {
        int[] arr1 = {1, 4, 2, 3};
        int[] arr2 = {-4, -3, 6, 10, 20, 30};
        int d = 3;
        int expected = 2;
        assertEquals(expected, solver.findTheDistanceValue(arr1, arr2, d));
    }

    @Test
    public void testFindTheDistanceValueExample3() {
        int[] arr1 = {2, 1, 100, 3};
        int[] arr2 = {-5, -2, 10, -3, 7};
        int d = 6;
        int expected = 1;
        assertEquals(expected, solver.findTheDistanceValue(arr1, arr2, d));
    }

    @Test
    public void testFindTheDistanceValueEmptyArr1() {
        int[] arr1 = {};
        int[] arr2 = {1, 2, 3};
        int d = 1;
        int expected = 0;
        assertEquals(expected, solver.findTheDistanceValue(arr1, arr2, d));
    }

    @Test
    public void testFindTheDistanceValueEmptyArr2() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {};
        int d = 1;
        int expected = 3;
        assertEquals(expected, solver.findTheDistanceValue(arr1, arr2, d));
    }


}