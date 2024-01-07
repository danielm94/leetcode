package com.github.danielm94.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseVowelsOfStringTest {

    private ReverseVowelsOfString reverser;

    @BeforeEach
    void setUp() {
        reverser = new ReverseVowelsOfString();
    }

    @Test
    public void testReverseVowelsExample1() {
        String input = "hello";
        String expected = "holle";
        assertEquals(expected, reverser.reverseVowels(input));
    }

    @Test
    public void testReverseVowelsExample2() {
        String input = "leetcode";
        String expected = "leotcede";
        assertEquals(expected, reverser.reverseVowels(input));
    }
}