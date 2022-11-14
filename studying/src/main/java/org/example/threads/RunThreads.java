package org.example.threads;

import java.lang.*;
public class RunThreads implements Runnable{
    public static void main(String[] args) {
        RunThreads runner = new RunThreads();
        Thread alpha = new Thread(runner);
        Thread beta = new Thread(runner);
        alpha.setName("Thread alpha");
        beta.setName("Thread beta");
        alpha.start();
        beta.start();

    }
    public void run(){
        for (int i = 0; i < 25; i++) {
            String threadName = Thread.currentThread().getName();
            System.out.println("Now, its working: " + threadName);
        }
    }
}
