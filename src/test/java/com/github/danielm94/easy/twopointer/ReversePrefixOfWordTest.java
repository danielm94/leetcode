package com.github.danielm94.easy.twopointer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReversePrefixOfWordTest {
    private ReversePrefixOfWord reverse;

    @BeforeEach
    void setUp() {
        reverse = new ReversePrefixOfWord();
    }

    @Test
    void example1() {
        var word = "abcdefd";
        var character = 'd';
        var expected = "dcbaefd";
        var actual = reverse.reversePrefix(word, character);
        assertEquals(expected, actual);
    }

    @Test
    void example2() {
        var word = "xyxzxe";
        var character = 'z';
        var expected = "zxyxxe";
        var actual = reverse.reversePrefix(word, character);
        assertEquals(expected, actual);
    }

    @Test
    void example3() {
        var word = "abcd";
        var character = 'z';
        var expected = "abcd";
        var actual = reverse.reversePrefix(word, character);
        assertEquals(expected, actual);
    }
}