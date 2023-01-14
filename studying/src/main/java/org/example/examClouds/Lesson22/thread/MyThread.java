package org.example.examClouds.Lesson22.thread;

public class MyThread extends Thread {
    public void run() {
        System.out.println("Важная работа выполняется в потоке " + getName());
    }
}
