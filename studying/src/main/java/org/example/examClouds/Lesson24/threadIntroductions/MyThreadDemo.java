package org.example.examClouds.Lesson24.threadIntroductions;

public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.run("Boob");
    }
}