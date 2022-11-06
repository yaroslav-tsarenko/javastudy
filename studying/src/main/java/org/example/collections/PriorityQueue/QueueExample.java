package org.example.collections.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class QueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.offer(4);
        queue.offer(5);
        queue.offer(1);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        PriorityQueue<UserProfile> usersQueue = new PriorityQueue<>();
        Comparator.comparing((UserProfile u) -> u.age);

        usersQueue.offer(new UserProfile(20));
        usersQueue.offer(new UserProfile(30));
        usersQueue.offer(new UserProfile(40));
    }


    static class UserProfile{
        private final Integer age;

        public UserProfile(Integer age){
            this.age = age;
        }

        public Integer getAge(){
            return age;
        }
    }
}
