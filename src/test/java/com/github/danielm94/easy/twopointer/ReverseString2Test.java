package com.github.danielm94.easy.twopointer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseString2Test {

    private ReverseString2 reverser;

    @BeforeEach
    void setUp() {
        reverser = new ReverseString2();
    }

    @Test
    public void testReverseStrExample1() {
        String input = "abcdefg";
        int k = 2;
        String expected = "bacdfeg";
        assertEquals(expected, reverser.reverseStr(input, k));
    }

    @Test
    public void testReverseStrExample2() {
        String input = "abcd";
        int k = 2;
        String expected = "bacd";
        assertEquals(expected, reverser.reverseStr(input, k));
    }

    @Test
    public void testReverseStrLargeK() {
        ReverseString2 reverser = new ReverseString2();
        String input = "abc";
        int k = 4;
        String expected = "cba";
        assertEquals(expected, reverser.reverseStr(input, k));
    }

    @Test
    public void testReverseStrKEqualToLength() {
        ReverseString2 reverser = new ReverseString2();
        String input = "abc";
        int k = 3;
        String expected = "cba";
        assertEquals(expected, reverser.reverseStr(input, k));
    }

    @Test
    public void testReverseStrSingleChar() {
        ReverseString2 reverser = new ReverseString2();
        String input = "a";
        int k = 1;
        String expected = "a";
        assertEquals(expected, reverser.reverseStr(input, k));
    }
}
