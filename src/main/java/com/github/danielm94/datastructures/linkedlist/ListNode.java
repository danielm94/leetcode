package com.github.danielm94.datastructures.linkedlist;

import java.util.HashSet;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        var builder = new StringBuilder();
        builder.append(val);
        var cycleDetector = new HashSet<ListNode>();
        var cycleFound = false;
        for (var curr = next; curr != null; curr = curr.next) {
            if (!cycleDetector.add(curr)) {
                cycleFound = true;
                break;
            }
            builder.append(" > ").append(curr.val);
        }
        if (cycleFound) builder.append(" > infinite cycle..");
        return builder.toString();
    }
}
