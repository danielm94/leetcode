package com.github.danielm94.easy.twopointer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemovePalindromicSubsequencesTest {
    @Test
    public void testRemovePalindromeSubExample1() {
        RemovePalindromicSubsequences remover = new RemovePalindromicSubsequences();
        String s = "ababa";
        int expected = 1;
        assertEquals(expected, remover.removePalindromeSub(s));
    }

    @Test
    public void testRemovePalindromeSubExample2() {
        RemovePalindromicSubsequences remover = new RemovePalindromicSubsequences();
        String s = "abb";
        int expected = 2;
        assertEquals(expected, remover.removePalindromeSub(s));
    }

    @Test
    public void testRemovePalindromeSubExample3() {
        RemovePalindromicSubsequences remover = new RemovePalindromicSubsequences();
        String s = "baabb";
        int expected = 2;
        assertEquals(expected, remover.removePalindromeSub(s));
    }
}