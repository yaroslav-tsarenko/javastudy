package org.example.examClouds.Lesson24.homework;

public class ExampleWithRunnable {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runner());
        Thread thread2 = new Thread(new Runner());
        Thread thread3 = new Thread(new Runner());
        thread1.start();
        thread2.start();
        thread3.start();
    }

}

class Runner implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i < 101; i++) {
            if (i % 10 == 0) {
                System.out.println(Thread.currentThread().getName() + " thread:\t" + i + " division by 10");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}



