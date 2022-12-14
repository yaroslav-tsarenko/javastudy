package org.example.examClouds.Lesson10.staticVariable;

public class BallDemo {
    public static void main(String[] args) {
        Ball ball1 = new Ball("red");
        Ball ball2 = new Ball("blue");
        System.out.println("Amount of created variables: "
                + Ball.count);
        sum(3,5);
    }

    public static void sum(int a, int b){
        int x = a + b;
        System.out.println(x);
    }
}
