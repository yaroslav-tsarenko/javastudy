package org.example.leetCode;

public class removeDuplicatesFromNode {
    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode currentNode = head;
        while (currentNode != null && currentNode.next != null) {
            if (currentNode.next.val == currentNode.val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }
        return head;
    }
}
