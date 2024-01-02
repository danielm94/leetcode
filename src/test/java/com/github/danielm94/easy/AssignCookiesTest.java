package com.github.danielm94.easy;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssignCookiesTest {

    @Test
    void testSolution() {
        val assignCookies = new AssignCookies();
        val g1 = new int[]{10, 9, 8, 7}; // Greed factors of the children
        val s1 = new int[]{5, 6, 7};     // Sizes of the cookies
        val result = assignCookies.findContentChildren(g1, s1);
        assertEquals(1, result);
    }

    @Test
    void failedTest() {
        val assignCookies = new AssignCookies();
        val g1 = new int[]{1, 2, 3}; // Greed factors of the children
        val s1 = new int[]{3};     // Sizes of the cookies
        val result = assignCookies.findContentChildren(g1, s1);
        assertEquals(1, result);
    }

    @Test
    void failedTest2() {
        val assignCookies = new AssignCookies();
        val g1 = new int[]{1, 2, 3}; // Greed factors of the children
        val s1 = new int[]{1, 1};     // Sizes of the cookies
        val result = assignCookies.findContentChildren(g1, s1);
        assertEquals(1, result);
    }

    @Test
    void failedTest3() {
        val assignCookies = new AssignCookies();
        val g1 = new int[]{10,9,8,7}; // Greed factors of the children
        val s1 = new int[]{5,6,7,8};     // Sizes of the cookies
        val result = assignCookies.findContentChildren(g1, s1);
        assertEquals(2, result);
    }
}