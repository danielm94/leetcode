package com.github.danielm94.medium;

import lombok.val;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringEncoderTest {
    private StringEncoder encoder;

    @BeforeEach
    void setUp() {
        encoder = new StringEncoder();
    }

    @Test
    void encode() {
        val input = List.of("Hello", "World", "Wow");
        val expected = "Hello\tWorld\tWow";
        val actual = encoder.encode(input);
        assertEquals(expected, actual);
    }

    @Test
    void decode() {
        val input = "Hello\tWorld\tWow";
        val expected = List.of("Hello", "World", "Wow");
        val actual = encoder.decode(input);
        assertEquals(expected, actual);
    }
}