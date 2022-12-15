package org.example.examClouds.Lesson11.interfaceIntroduction.moveable;

public class Transport implements Moveable {
    public void moveRight() {
        System.out.println("Transport turning right.");
    }

    public void moveLeft() {
        System.out.println("Transport turning left.");
    }

    public void stop() {
        System.out.println("Transport stopped.");
    }

    public void start() {
        System.out.println("Transport started.");
    }
}
