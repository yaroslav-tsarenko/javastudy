package org.example.leetCode;

import java.util.ArrayList;

public class MiddleOfTheLinkedList {
    public static void main(String[] args) {

    }

    public ListNode middleNode(ListNode head) {

        ListNode middle = head;
        ListNode end = head;

        while (end != null && end.next != null){
            middle = middle.next;
            end = end.next.next;
        }
        return middle;
    }
}
