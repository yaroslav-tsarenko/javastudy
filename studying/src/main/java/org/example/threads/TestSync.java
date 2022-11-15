package org.example.threads;

public class TestSync implements Runnable{
    private int balance;

    public void run(){
        for (int i = 0; i < 50; i++) {
            increment();
            System.out.println("Balance equals: " + balance);
        }
    }

    public void increment(){
        int i = balance;
        balance = i + 1;
    }

}
 class TestSyncTest{
    public static void main(String[] args) {
        TestSync job = new TestSync();
        Thread a = new Thread(job);
        Thread b = new Thread(job);
        a.start();
        b.start();
    }
}
