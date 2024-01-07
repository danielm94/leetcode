package com.github.danielm94.easy.twopointer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LexiocographicallySmallestPalindromeTest {

    private LexiocographicallySmallestPalindrome palindromeMaker;

    @BeforeEach
    void setUp() {
        palindromeMaker = new LexiocographicallySmallestPalindrome();
    }

    @Test
    public void testMakeSmallestPalindromeExample1() {
        String input = "egcfe";
        String expected = "efcfe";
        assertEquals(expected, palindromeMaker.makeSmallestPalindrome(input));
    }

    @Test
    public void testMakeSmallestPalindromeExample2() {
        String input = "abcd";
        String expected = "abba";
        assertEquals(expected, palindromeMaker.makeSmallestPalindrome(input));
    }

    @Test
    public void testMakeSmallestPalindromeExample3() {
        String input = "seven";
        String expected = "neven";
        assertEquals(expected, palindromeMaker.makeSmallestPalindrome(input));
    }


    @Test
    public void testMakeSmallestPalindromeAlreadyPalindrome() {
        String input = "racecar";
        String expected = "racecar";
        assertEquals(expected, palindromeMaker.makeSmallestPalindrome(input));
    }

    @Test
    public void testMakeSmallestPalindromeSingleChar() {
        String input = "a";
        String expected = "a";
        assertEquals(expected, palindromeMaker.makeSmallestPalindrome(input));
    }
}
