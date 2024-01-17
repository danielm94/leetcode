package com.github.danielm94.easy.twopointer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ShortestDistanceToCharacterTest {
    private ShortestDistanceToCharacter solver;

    @BeforeEach
    void setUp() {
        solver = new ShortestDistanceToCharacter();
    }

    @Test
    public void testShortestToCharExample1() {
        String s = "loveleetcode";
        char c = 'e';
        int[] expected = {3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0};
        assertArrayEquals(expected, solver.shortestToChar(s, c));
    }

    @Test
    public void testShortestToCharExample2() {
        String s = "aaab";
        char c = 'b';
        int[] expected = {3, 2, 1, 0};
        assertArrayEquals(expected, solver.shortestToChar(s, c));
    }

    @Test
    public void testShortestToCharSingleCharacter() {
        String s = "a";
        char c = 'a';
        int[] expected = {0};
        assertArrayEquals(expected, solver.shortestToChar(s, c));
    }
}