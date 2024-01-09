package com.github.danielm94.util;

import com.github.danielm94.datastructures.linkedlist.ListNode;

import java.util.List;

public class ListNodeUtil {
    private ListNodeUtil() {
    }

    public static ListNode getListNodeFromList(List<Integer> list) {
        if (list == null || list.isEmpty()) throw new IllegalArgumentException("List cannot be null or empty.");
        ListNode head = new ListNode();
        ListNode curr = head;

        for (var val : list) {
            curr = curr.next = new ListNode(val);
        }

        return head.next;
    }
}
