package com.github.danielm94.easy;

import lombok.val;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidPalindromeTest {
    private ValidPalindrome valid;

    @BeforeEach
    void setUp() {
        valid = new ValidPalindrome();
    }

    @Test
    void example1() {
        val input = "A man, a plan, a canal: Panama";
        assertTrue(valid.isPalindrome(input));
    }

    @Test
    void example2() {
        val input = "race a car";
        assertFalse(valid.isPalindrome(input));
    }

    @Test
    void example3() {
        val input = " ";
        assertTrue(valid.isPalindrome(input));
    }
}