package org.example.examClouds.Lesson16.anonymousClass;

public class Food {
    public static void main(String[] args) {
        Potato potato = new Potato() {
            @Override
            public void peel() {
                System.out.println("Чистим картошку в анонимном классе.");
            }
        };
        potato.peel();
    }
}
