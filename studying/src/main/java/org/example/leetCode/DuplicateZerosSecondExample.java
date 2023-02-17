package org.example.leetCode;

import java.util.LinkedList;
import java.util.Queue;

public class DuplicateZerosSecondExample {
    public static void main(String[] args) {
        int[] array = {3, 2, 1, 0, 2, 4, 0, 5, 0};
        duplicateZeros(array);

    }

    public static void duplicateZeros(int[] array){
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0){
                queue.add(0);
                queue.add(0);
            }else {
                queue.add(array[i]);
            }
            Integer first = queue.poll();
            array[i] = first;
        }
        System.out.println(queue);
    }
}
