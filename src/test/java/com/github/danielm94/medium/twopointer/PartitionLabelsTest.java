package com.github.danielm94.medium.twopointer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartitionLabelsTest {

    private PartitionLabels partitioner;

    @BeforeEach
    void setUp() {
        partitioner = new PartitionLabels();
    }

    @Test
    public void testPartitionLabelsExample1() {
        String s = "ababcbacadefegdehijhklij";
        List<Integer> expected = Arrays.asList(9, 7, 8);
        assertEquals(expected, partitioner.partitionLabels(s));
    }

    @Test
    public void testPartitionLabelsExample2() {
        String s = "eccbbbbdec";
        List<Integer> expected = Arrays.asList(10);
        assertEquals(expected, partitioner.partitionLabels(s));
    }

    @Test
    public void testPartitionLabelsAllDistinctCharacters() {
        String s = "abcdefgh";
        List<Integer> expected = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1);
        assertEquals(expected, partitioner.partitionLabels(s));
    }

    @Test
    public void testPartitionLabelsSingleCharacterRepeated() {
        String s = "aaaaaa";
        List<Integer> expected = Arrays.asList(6);
        assertEquals(expected, partitioner.partitionLabels(s));
    }

    // Additional test cases can be added here to cover more scenarios, such as strings with non-repeated characters, longer strings, etc.
}
