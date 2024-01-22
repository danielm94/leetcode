package com.github.danielm94.medium.twopointer;

import com.github.danielm94.datastructures.linkedlist.ListNode;

import java.util.ArrayDeque;

public class MaximumTwinSumOfALinkedList {
    private static ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        var curr = head;

        while (curr != null) {
            var next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public int pairSumUsingArrayDeque(ListNode head) {
        var stack = new ArrayDeque<ListNode>();

        for (var curr = head; curr != null; curr = curr.next) {
            stack.add(curr);
        }

        var n = stack.size();
        var i = 0;
        var max = Integer.MIN_VALUE;

        for (ListNode curr = head; i <= n / 2; i++, curr = curr.next) {
            var sum = curr.val + stack.removeLast().val;
            max = Math.max(max, sum);
        }

        return max;
    }

    public int pairSum(ListNode listNode) {
        var slow = listNode;
        var fast = listNode;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        var reversed = reverseLinkedList(slow);
        var max = Integer.MIN_VALUE;
        while (reversed != null & listNode != null) {
            var sum = reversed.val + listNode.val;
            max = Math.max(sum, max);
            reversed = reversed.next;
            listNode = listNode.next;
        }
        return max;
    }
}
