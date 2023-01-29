package org.example.examClouds.Lesson24.threadIntroductions;

public class FirstExampleWithThread {
    public static void main(String[] args) {
        MyOwnThread myOwnThread = new MyOwnThread();
        myOwnThread.start();

        MyOwnThread myOwnThread1 = new MyOwnThread();
        myOwnThread1.start();
    }
}


