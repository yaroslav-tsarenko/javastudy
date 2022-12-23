package org.example.examClouds.Lesson16.anonymousClass;

public class MoveableDemo {
    public static void main(String[] args) {
        Moveable moveable = new Moveable() {
            @Override
            public void moveRight() {
                System.out.println("MOVING RIGHT!!!");
            }

            @Override
            public void moveLeft() {
                System.out.println("MOVING LEFT!!!");
            }
        };
        moveable.moveRight();
        moveable.moveLeft();
    }
}
