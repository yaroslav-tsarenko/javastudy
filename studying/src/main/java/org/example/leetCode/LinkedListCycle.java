package org.example.leetCode;

import java.util.List;

public class LinkedListCycle {
    public static void main(String[] args) {

    }

    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode intersect = intersection(head);
        if (intersect == null) {
            return null;
        }
        ListNode start = head;
        while (intersect != start) {
            start = start.next;
            intersect = intersect.next;
        }
        return start;
    }

    public ListNode intersection(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return slow;
            }
        }
        return null;
    }
}
