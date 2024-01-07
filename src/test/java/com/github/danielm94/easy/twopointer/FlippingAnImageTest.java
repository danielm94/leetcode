package com.github.danielm94.easy.twopointer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FlippingAnImageTest {

    private FlippingAnImage flipper;

    @BeforeEach
    void setUp() {
        flipper = new FlippingAnImage();
    }

    @Test
    public void testFlipAndInvertImageExample1() {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] expected = {{1, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        var actual = flipper.flipAndInvertImage(image);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFlipAndInvertImageExample2() {
        int[][] image = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        int[][] expected = {{1, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 1}, {1, 0, 1, 0}};
        assertArrayEquals(expected, flipper.flipAndInvertImage(image));
    }

    @Test
    public void testFlipAndInvertImageSingleRow() {
        int[][] image = {{1, 0}};
        int[][] expected = {{1, 0}};
        assertArrayEquals(expected, flipper.flipAndInvertImage(image));
    }

    @Test
    public void testFlipAndInvertImageEmpty() {
        int[][] image = {};
        int[][] expected = {};
        assertArrayEquals(expected, flipper.flipAndInvertImage(image));
    }
}
