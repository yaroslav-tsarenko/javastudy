package org.example.cycles.cycleFor;

public class TaskWithFiveStars {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int b = 0; b < 5; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
