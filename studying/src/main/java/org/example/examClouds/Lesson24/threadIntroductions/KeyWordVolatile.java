package org.example.examClouds.Lesson24.threadIntroductions;

import org.example.examClouds.Lesson9.overrideMethods.M;

import java.util.Scanner;

public class KeyWordVolatile {
    public static void main(String[] args) {
        MyOwnThread2 myOwnThread2 = new MyOwnThread2();
        myOwnThread2.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        myOwnThread2.shutdown();
    }
}

class MyOwnThread2 extends Thread {

    private volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown(){
        this.running = false;
    }
}
