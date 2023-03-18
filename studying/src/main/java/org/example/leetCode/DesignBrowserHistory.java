package org.example.leetCode;

import org.example.examClouds.Lesson9.overrideMethods.N;

public class DesignBrowserHistory {
    public static void main(String[] args) {

    }

    class Node {
        Node prev, next;
        String url;

        Node(String url) {
            prev = null;
            next = null;
            this.url = url;
        }
    }

    Node curr;

    public void BrowserHistory(String homepage) {
        curr = new Node(homepage);
    }

    public void visit(String url) {
        Node tempNode = new Node(url);
        curr.next = tempNode;
        tempNode.prev = curr;
        curr = curr.next;
    }

    public String back(int steps) {
        while (curr.prev != null && steps-- > 0) {
            curr = curr.prev;
        }
        return curr.url;
    }

    public String forward(int steps) {
        while (curr.next != null && steps-- > 0) {
            curr = curr.next;
        }
        return curr.url;
    }
}
