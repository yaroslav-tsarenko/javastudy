package org.example.threads;
import java.lang.*;

public class BankAccount {
    private int balance = 100;

    public int getBalance(){
        return balance;
    }
    public void withdraw(int amount){
        balance = balance - amount;
    }
}

class RyanAndMonicaJob implements Runnable {

    private BankAccount account = new BankAccount();

    public static void main(String[] args) {
        RyanAndMonicaJob theJob = new RyanAndMonicaJob();
        Thread one = new Thread(theJob);
        Thread two = new Thread(theJob);
        one.setName("Ryan");
        two.setName("Monica");
        one.start();
        two.start();
    }

    public void run(){
        for (int i = 0; i < 10; i++) {
            makeWithdrawal(10);
            if (account.getBalance() < 0){
                System.out.println("You have cross the limit");
            }
        }
    }

    private synchronized void makeWithdrawal (int amount){
        if(account.getBalance() >= amount){
            System.out.println(Thread.currentThread());
            try{
                System.out.println(Thread.currentThread());
                Thread.sleep(500);
            } catch (InterruptedException ex){
                ex.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "wake up");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + "completing transaction");

        }else {
            System.out.println("Sorry, but for client " + Thread.currentThread().getName() + "not enough money");
        }
    }
}
