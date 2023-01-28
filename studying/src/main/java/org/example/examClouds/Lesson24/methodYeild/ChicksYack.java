package org.example.examClouds.Lesson24.methodYeild;

class Chicks {
    synchronized void yack(long id) {
        for (int x = 1; x < 3; x++) {
            System.out.print(id + " ");
            Thread.yield();
        }
    }
}

public class ChicksYack implements Runnable {
    Chicks c;

    public static void main(String[] args) {
        new ChicksYack().go();
    }

    void go() {
        c = new Chicks();
        new Thread(new ChicksYack()).start();
        new Thread(new ChicksYack()).start();
    }

    public void run() {
        c.yack(Thread.currentThread().getId());
    }
}
