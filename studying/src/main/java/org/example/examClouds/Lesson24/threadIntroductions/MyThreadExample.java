package org.example.examClouds.Lesson24.threadIntroductions;

class MyThreadExample implements Runnable {
    public static void main(String[] args) {
        MyThread run = new MyThread();
        Thread t = new Thread(run);
        t.start();
    }

    public void run() {
    }
}

class MyThread2 extends Thread {

    public static void main(String[] args) {
        MyThread2 t = new MyThread2();
        Thread x = new Thread(t);
        x.start();
    }

    public void run() {
        for (int i = 0; i < 3; ++i) {
            System.out.print(i + "..");
        }
    }
}
