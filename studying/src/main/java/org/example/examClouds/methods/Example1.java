package org.example.examClouds.methods;

public class Example1 {
    static void print() {
        System.out.println("Print some info");
    }

    public static void main(String[] args) {
        print();
    }
}

class Example2 {
    public static void main(String[] args) {
      int x =  sum(3,4);
        System.out.println(x);

    }


    static int sum(int a, int b) {
        return (a + b);
    }
}
