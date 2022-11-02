package org.example.string.methods;

public class FormatMethod {
    public static void main(String[] args) {
        String s = String.format("%.2f errors", 465655.04594595);
        System.out.println(s);
    }
}

class AnotherExampleStringFormat {
    int one = 20456654;
    double two = 100567890.248907;
    String s1 = String.format("Level %,d from %,2.f", one, two);
}
