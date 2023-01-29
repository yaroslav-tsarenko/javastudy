package org.example.examClouds.Lesson24.homework;

public class ExampleOfThread {
    public static void main(String[] args) {
     NewThread thread = new NewThread();
     thread.start();
    }
}

class NewThread extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Example of thread");
        }
    }
}
