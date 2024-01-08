package com.github.danielm94.easy.twopointer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstPalindromicStringTest {
    @Test
    public void testFirstPalindromeExample1() {
        FirstPalindromicString finder = new FirstPalindromicString();
        String[] words = {"abc", "car", "ada", "racecar", "cool"};
        String expected = "ada";
        assertEquals(expected, finder.firstPalindrome(words));
    }

    @Test
    public void testFirstPalindromeExample2() {
        FirstPalindromicString finder = new FirstPalindromicString();
        String[] words = {"notapalindrome", "racecar"};
        String expected = "racecar";
        assertEquals(expected, finder.firstPalindrome(words));
    }

    @Test
    public void testFirstPalindromeExample3() {
        FirstPalindromicString finder = new FirstPalindromicString();
        String[] words = {"def", "ghi"};
        String expected = "";
        assertEquals(expected, finder.firstPalindrome(words));
    }
}