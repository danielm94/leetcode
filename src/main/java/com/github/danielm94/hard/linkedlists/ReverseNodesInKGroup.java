package com.github.danielm94.hard.linkedlists;

import com.github.danielm94.datastructures.linkedlist.ListNode;

import java.util.ArrayDeque;

public class ReverseNodesInKGroup {


    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) return null;
        var deque = new ArrayDeque<ListNode>();

        var resultHead = new ListNode();
        var resultCurr = resultHead;
        var i = 0;

        for (var curr = head; curr != null; curr = curr.next) {
            if (i++ % k == 0) {
                while (!deque.isEmpty()) {
                    resultCurr.next = deque.pollLast();
                    resultCurr = resultCurr.next;
                }
            }

            deque.add(curr);
        }

        if (deque.size() < k) {
            while (!deque.isEmpty()) {
                resultCurr.next = deque.pollFirst();
                resultCurr = resultCurr.next;
            }
        } else {
            while (!deque.isEmpty()) {
                resultCurr.next = deque.pollLast();
                resultCurr = resultCurr.next;
            }
            resultCurr.next = null;
        }

        return resultHead.next;
    }
}
