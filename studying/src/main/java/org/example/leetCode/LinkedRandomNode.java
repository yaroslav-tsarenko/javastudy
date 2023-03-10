package org.example.leetCode;

import java.util.ArrayList;

public class LinkedRandomNode {

    public static void main(String[] args) {

    }

    ArrayList<Integer> arr = new ArrayList<>();

    public void Solution(ListNode head) {
        while (head != null) {
            arr.add(head.val);
            head = head.next;
        }
    }

    public int getRandom() {
        return arr.get((int) (Math.random() * arr.size()));
    }
}
