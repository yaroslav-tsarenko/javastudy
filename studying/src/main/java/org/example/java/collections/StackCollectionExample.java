package org.example.java.collections;

import java.util.Deque;
import java.util.LinkedList;

public class StackCollectionExample {
    public static void main(String[] args) {
        Deque<Integer> stack = new LinkedList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while(!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }
    }
}
