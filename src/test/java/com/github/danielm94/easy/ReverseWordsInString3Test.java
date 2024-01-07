package com.github.danielm94.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseWordsInString3Test {

    private ReverseWordsInString3 reverser;

    @BeforeEach
    void setUp() {
        reverser = new ReverseWordsInString3();
    }

    @Test
    public void testReverseWordsExample1() {
        String input = "Let's take LeetCode contest";
        String expected = "s'teL ekat edoCteeL tsetnoc";
        assertEquals(expected, reverser.reverseWords(input));
    }

    @Test
    public void testReverseWordsExample2() {
        String input = "Mr Ding";
        String expected = "rM gniD";
        assertEquals(expected, reverser.reverseWords(input));
    }

    @Test
    public void testReverseWordsSingleWord() {
        String input = "Hello";
        String expected = "olleH";
        assertEquals(expected, reverser.reverseWords(input));
    }

    @Test
    public void testReverseWordsMultipleSpaces() {
        String input = "Hello   world";
        String expected = "olleH   dlrow";
        assertEquals(expected, reverser.reverseWords(input));
    }
}