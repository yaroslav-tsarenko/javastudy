package org.example.cycles.cycleWhile;

public class CycleWhileExample {
    public static void main(String[] args) {

        int n = 0;    //iteration
        while(n < 10){
            System.out.println(++n + "." + "Do step");
            n++;
        }
    }
}
