package com.github.danielm94.easy.linkedlist;

import com.github.danielm94.datastructures.linkedlist.ListNode;
import com.github.danielm94.util.ListNodeUtil;

import java.util.List;

public class ReverseLinkedList {
    public static void main(String[] args) {
        var listNode = ListNodeUtil.getListNodeFromList(List.of(1, 2, 3, 4, 5, 6));
        var reversed = new ReverseLinkedList().reverseList(listNode);
        System.out.println();
    }

    public ListNode reverseListIteratively(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            var next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        var newHead = head;
        if (head.next != null) {
            newHead = reverseList(head.next);
            head.next.next = head;
        }

        head.next = null;
        return newHead;
    }


}
