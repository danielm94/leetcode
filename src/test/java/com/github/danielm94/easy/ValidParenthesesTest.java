package com.github.danielm94.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesesTest {

    private ValidParentheses validator;

    @BeforeEach
    void setUp() {
        validator = new ValidParentheses();
    }

    @Test
    public void testIsValidExample1() {
        String input = "()";
        assertTrue(validator.isValid(input));
    }

    @Test
    public void testIsValidExample2() {
        String input = "()[]{}";
        assertTrue(validator.isValid(input));
    }

    @Test
    public void testIsValidExample3() {
        String input = "(]";
        assertFalse(validator.isValid(input));
    }

    // Additional test cases can be added here

    // Example: Testing with an empty string
    // @Test
    // public void testIsValidEmptyString() {
    //     ValidParentheses validator = new ValidParentheses();
    //     String input = "";
    //     assertTrue(validator.isValid(input)); // Assuming an empty string is considered valid
    // }

    // Example: Testing with a string containing a single bracket
    // @Test
    // public void testIsValidSingleBracket() {
    //     ValidParentheses validator = new ValidParentheses();
    //     String input = "(";
    //     assertFalse(validator.isValid(input)); // A single bracket cannot be valid
    // }
}
