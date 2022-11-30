package org.example.examClouds.variableRefactoring;

public class IntegerDemo1 {
    public static void main(String[] args) {
        byte b1 = 50, b2 = -99;
       /* short k = b1 + b2;*/ //ошибка компиляции
        /*System.out.println("k=" + k);*/
    }
}

class IntegerDemo2 {
    public static void main(String[] args) {
        byte b1 = 50, b2 = -99;
        b1 += b2;
        System.out.println("b1=" + b1);
    }
}