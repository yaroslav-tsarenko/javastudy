package org.example.cycles.cycleFor;

public class CycleForSecondExample {
    public static void main(String[] args) {

//        for (int i = 0; i < 20; i++) {
//            for (int k = 0; k < 10; k++) {
//                System.out.println(i);
//                System.out.println(k);
//            }
//        }

        int k = 2;
        for (int i = k; i < 20; i = i * 2) {
            System.out.println(i);
        }
    }
}
