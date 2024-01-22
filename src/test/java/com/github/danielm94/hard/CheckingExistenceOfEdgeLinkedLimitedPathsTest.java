package com.github.danielm94.hard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CheckingExistenceOfEdgeLinkedLimitedPathsTest {

    private CheckingExistenceOfEdgeLinkedLimitedPaths solver;

    @BeforeEach
    void setUp() {
        solver = new CheckingExistenceOfEdgeLinkedLimitedPaths();
    }

    @Test
    public void testDistanceLimitedPathsExistExample1() {
        int n = 3;
        int[][] edgeList = {{0, 1, 2}, {1, 2, 4}, {2, 0, 8}, {1, 0, 16}};
        int[][] queries = {{0, 1, 2}, {0, 2, 5}};
        boolean[] expected = {false, true};
        assertArrayEquals(expected, solver.distanceLimitedPathsExist(n, edgeList, queries));
    }

    @Test
    public void testDistanceLimitedPathsExistExample2() {
        int n = 5;
        int[][] edgeList = {{0, 1, 10}, {1, 2, 5}, {2, 3, 9}, {3, 4, 13}};
        int[][] queries = {{0, 4, 14}, {1, 4, 13}};
        boolean[] expected = {true, false};
        assertArrayEquals(expected, solver.distanceLimitedPathsExist(n, edgeList, queries));
    }

    @Test
    public void testDistanceLimitedPathsExistNoEdges() {
        int n = 3;
        int[][] edgeList = {};
        int[][] queries = {{0, 1, 1}, {1, 2, 2}};
        boolean[] expected = {false, false};
        assertArrayEquals(expected, solver.distanceLimitedPathsExist(n, edgeList, queries));
    }

    @Test
    public void testDistanceLimitedPathsExistSingleEdge() {
        int n = 2;
        int[][] edgeList = {{0, 1, 3}};
        int[][] queries = {{0, 1, 4}, {0, 1, 2}};
        boolean[] expected = {true, false};
        assertArrayEquals(expected, solver.distanceLimitedPathsExist(n, edgeList, queries));
    }

    @Test
    public void testDistanceLimitedPaths() {
        // Setup
        int n = 13;
        int[][] edgeList = {
                {9, 1, 53}, {3, 2, 66}, {12, 5, 99}, {9, 7, 26}, {1, 4, 78}, {11, 1, 62},
                {3, 10, 50}, {12, 1, 71}, {12, 6, 63}, {1, 10, 63}, {9, 10, 88}, {9, 11, 59},
                {1, 4, 37}, {4, 2, 63}, {0, 2, 26}, {6, 12, 98}, {9, 11, 99}, {4, 5, 40},
                {2, 8, 25}, {4, 2, 35}, {8, 10, 9}, {11, 9, 25}, {10, 11, 11}, {7, 6, 89},
                {2, 4, 99}, {10, 4, 63}
        };
        int[][] queries = {{10, 8, 43}};

        // Expected results
        boolean[] expected = {true};

        // Test
        boolean[] result = solver.distanceLimitedPathsExist(n, edgeList, queries);

        // Assert
        assertArrayEquals(expected, result);
    }

    // Additional test cases can be added here to cover more scenarios, such as large graphs, graphs with multiple paths between nodes, etc.
}
