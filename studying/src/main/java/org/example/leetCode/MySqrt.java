package org.example.leetCode;

public class MySqrt {
    public static void main(String[] args) {

        System.out.println(mySqrt(8));
    }

    public static int mySqrt(int x){
        double a = (double) Math.sqrt(x);
        return (int) a;
    }
}
