package com.github.danielm94.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class AnagramGrouperTest {
    private AnagramGrouper anagramGrouper;

    @BeforeEach
    void setUp() {
        this.anagramGrouper = new AnagramGrouper();
    }

    private boolean areEqualIgnoringOrder(List<List<String>> list1, List<List<String>> list2) {
        if (list1.size() != list2.size()) return false;

        Set<Set<String>> set1 = new HashSet<>();
        for (List<String> sublist : list1) {
            set1.add(new HashSet<>(sublist));
        }

        Set<Set<String>> set2 = new HashSet<>();
        for (List<String> sublist : list2) {
            set2.add(new HashSet<>(sublist));
        }

        return set1.equals(set2);
    }

    @Test
    public void testExample1() {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> expected = Arrays.asList(
                List.of("bat"),
                Arrays.asList("nat", "tan"),
                Arrays.asList("ate", "eat", "tea")
        );

        assertTrue(areEqualIgnoringOrder(expected, anagramGrouper.groupAnagrams(input)));
    }

    @Test
    public void testExample2() {
        String[] input = {""};
        List<List<String>> expected = List.of(
                List.of("")
        );

        assertTrue(areEqualIgnoringOrder(expected, anagramGrouper.groupAnagrams(input)));
    }

    @Test
    public void testExample3() {
        String[] input = {"a"};
        List<List<String>> expected = List.of(
                List.of("a")
        );

        assertTrue(areEqualIgnoringOrder(expected, anagramGrouper.groupAnagrams(input)));
    }
}