package org.example.examClouds.Lesson24.threadIntroductions;

import javax.sound.midi.Track;

public class SecondExampleWithThread {
    public static void main(String[] args) {
      /*  MyOwnThread myOwnThread = new MyOwnThread();
        myOwnThread.start();

        MyOwnThread myOwnThread1 = new MyOwnThread();
        myOwnThread1.start();*/


        Thread thread = new Thread(new Runner());
        thread.start();
        System.out.println("Hello from main thread");
    }
}

class Runner implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i < 6; i++){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello from MyOwnThread " + i);
        }
    }
}

class MyOwnThread extends Thread{
    public void run(){
        for (int i = 1; i < 1001; i++){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello from MyOwnThread " + i);
        }
    }
}
