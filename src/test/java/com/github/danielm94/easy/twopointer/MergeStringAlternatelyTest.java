package com.github.danielm94.easy.twopointer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeStringAlternatelyTest {

    @Test
    public void testMergeAlternatelyExample1() {
        MergeStringAlternately merger = new MergeStringAlternately();
        String word1 = "abc";
        String word2 = "pqr";
        String expected = "apbqcr";
        assertEquals(expected, merger.mergeAlternately(word1, word2));
    }

    @Test
    public void testMergeAlternatelyExample2() {
        MergeStringAlternately merger = new MergeStringAlternately();
        String word1 = "ab";
        String word2 = "pqrs";
        String expected = "apbqrs";
        assertEquals(expected, merger.mergeAlternately(word1, word2));
    }

    @Test
    public void testMergeAlternatelyExample3() {
        MergeStringAlternately merger = new MergeStringAlternately();
        String word1 = "abcd";
        String word2 = "pq";
        String expected = "apbqcd";
        assertEquals(expected, merger.mergeAlternately(word1, word2));
    }

    // Example: Testing with one empty string
    @Test
    public void testMergeAlternatelyEmptyString() {
        MergeStringAlternately merger = new MergeStringAlternately();
        String word1 = "";
        String word2 = "abc";
        String expected = "abc";
        assertEquals(expected, merger.mergeAlternately(word1, word2));
    }

    // Example: Testing with both strings of equal length
    @Test
    public void testMergeAlternatelyEqualLength() {
        MergeStringAlternately merger = new MergeStringAlternately();
        String word1 = "abcd";
        String word2 = "efgh";
        String expected = "aebfcgdh";
        assertEquals(expected, merger.mergeAlternately(word1, word2));
    }
}