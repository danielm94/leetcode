package com.github.danielm94.medium.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecodeStringTest {
    private DecodeString decoder;

    @BeforeEach
    void setUp() {
        decoder = new DecodeString();
    }

    @Test
    public void testDecodeStringExample1() {
        String input = "3[a]2[bc]";
        String expected = "aaabcbc";
        assertEquals(expected, decoder.decodeString(input));
    }

    @Test
    public void testDecodeStringExample2() {
        String input = "3[a2[c]]";
        String expected = "accaccacc";
        assertEquals(expected, decoder.decodeString(input));
    }

    @Test
    public void testDecodeStringExample3() {
        String input = "2[abc]3[cd]ef";
        String expected = "abcabccdcdcdef";
        assertEquals(expected, decoder.decodeString(input));
    }

    @Test
    public void testDecodeStringSingleChar() {
        String input = "10[a]";
        String expected = "aaaaaaaaaa";
        assertEquals(expected, decoder.decodeString(input));
    }

    @Test
    public void testDecodeStringNested() {
        String input = "2[3[a]b]";
        String expected = "aaabaaab";
        assertEquals(expected, decoder.decodeString(input));
    }

    @Test
    public void failedTest() {
        String input = "3[z]2[2[y]pq4[2[jk]e1[f]]]ef";
        String expected = "zzzyypqjkjkefjkjkefjkjkefjkjkefyypqjkjkefjkjkefjkjkefjkjkefef";
        assertEquals(expected, decoder.decodeString(input));
    }
}