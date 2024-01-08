package com.github.danielm94.easy.twopointer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DIStringMatchTest {
    @Test
    public void testDiStringMatchExample1() {
        DIStringMatch matcher = new DIStringMatch();
        String s = "IDID";
        int[] expected = {0, 4, 1, 3, 2}; // One of the possible valid permutations
        assertArrayEquals(expected, matcher.diStringMatch(s));
    }

    @Test
    public void testDiStringMatchExample2() {
        DIStringMatch matcher = new DIStringMatch();
        String s = "III";
        int[] expected = {0, 1, 2, 3}; // One of the possible valid permutations
        assertArrayEquals(expected, matcher.diStringMatch(s));
    }

    @Test
    public void testDiStringMatchExample3() {
        DIStringMatch matcher = new DIStringMatch();
        String s = "DDI";
        int[] expected = {3, 2, 0, 1}; // One of the possible valid permutations
        assertArrayEquals(expected, matcher.diStringMatch(s));
    }

}