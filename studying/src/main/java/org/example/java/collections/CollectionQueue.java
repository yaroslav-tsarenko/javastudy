package org.example.java.collections;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionQueue {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
