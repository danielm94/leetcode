package com.github.danielm94.easy;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {
    private final ValidAnagram validAnagram = new ValidAnagram();


    @Test
    void example1() {
        val val1 = "anagram";
        val val2 = "nagaram";
        assertTrue(validAnagram.isAnagram(val1, val2));
    }

    @Test
    void example2() {
        val val1 = "rat";
        val val2 = "car";
        assertFalse(validAnagram.isAnagram(val1, val2));
    }

    @Test
    public void testAnagramUnicodeTrue() {
        String s = "日本語"; // Japanese
        String t = "語日本"; // Rearranged characters of 'Japanese'
        assertTrue(validAnagram.isAnagramUnicode(s, t));
    }

    @Test
    public void testAnagramUnicodeFalse() {
        String s = "한국어"; // Korean
        String t = "日本語"; // Japanese
        assertFalse(validAnagram.isAnagramUnicode(s, t));
    }


}