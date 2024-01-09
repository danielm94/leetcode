package com.github.danielm94.util;

import com.github.danielm94.datastructures.linkedlist.ListNode;
import com.github.danielm94.hard.linkedlists.ReverseNodesInKGroup;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ReverseNodesInKGroupTest {
    private ReverseNodesInKGroup reverse;

    @BeforeEach
    void setUp() {
        reverse = new ReverseNodesInKGroup();
    }

    @Test
    void testReverseKGroupExample1() {
        ListNode head = ListNodeUtil.getListNodeFromList(List.of(1, 2, 3, 4, 5));
        int k = 2;
        ListNode expected = ListNodeUtil.getListNodeFromList(List.of(2, 1, 4, 3, 5));
        ListNode actual = reverse.reverseKGroup(head, k);
        assertTrue(compareListNodes(expected, actual));
    }

    @Test
    void testReverseKGroupExample2() {
        ListNode head = ListNodeUtil.getListNodeFromList(List.of(1, 2, 3, 4, 5));
        int k = 3;
        ListNode expected = ListNodeUtil.getListNodeFromList(List.of(3, 2, 1, 4, 5));
        ListNode actual = reverse.reverseKGroup(head, k);
        assertTrue(compareListNodes(expected, actual));
    }

    private boolean compareListNodes(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            if (l1.val != l2.val) {
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1 == null && l2 == null;
    }
}