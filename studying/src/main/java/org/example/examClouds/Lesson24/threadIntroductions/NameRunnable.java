package org.example.examClouds.Lesson24.threadIntroductions;

public class NameRunnable implements Runnable {
    public void run() {
        System.out.println("NameRunnable running");
        System.out.println("Run by "
                + Thread.currentThread().getName());
    }
}
