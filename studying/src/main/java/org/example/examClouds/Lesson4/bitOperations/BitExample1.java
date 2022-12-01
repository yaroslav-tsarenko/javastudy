package org.example.examClouds.Lesson4.bitOperations;

public class BitExample1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = ~b;
        System.out.println("a = " + Integer.toBinaryString(a));
        System.out.println("b = " + Integer.toBinaryString(b));
        System.out.println("a | b = " + Integer.toBinaryString(c));
        System.out.println("a & b = " + Integer.toBinaryString(d));
        System.out.println("a ^ b = " + Integer.toBinaryString(e));
        System.out.println("~ b = " + Integer.toBinaryString(f));
    }
}

class BitExample2 {
    public static void main(String[] args) {
        byte a = 64; //0100 0000
        byte b;
        int i = a << 2; // 1 0000 0000
        b = (byte) (a << 2); //0000 0000
        System.out.println("a = " + a);
        System.out.println("i = " + i);
        System.out.println("b = " + b);
    }
}

class BitExample3{
    public static void main(String[] args) {
        int message = 560;
        int mask = 67;
        int codedMessage = message ^ mask;
        int receivedMessage = codedMessage ^ mask;
        System.out.println("message = " + message);
        System.out.println("message = " + Integer.toBinaryString(message));
        System.out.println("codedMessage = " + codedMessage);
        System.out.println("codedMessage = " + Integer.toBinaryString(codedMessage));
        System.out.println("receivedMessage = " + receivedMessage);
        System.out.println("receivedMessage = " + Integer.toBinaryString(receivedMessage));
    }
}
