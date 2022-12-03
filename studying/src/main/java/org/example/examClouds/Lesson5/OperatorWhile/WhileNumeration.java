package org.example.examClouds.Lesson5.OperatorWhile;

public class WhileNumeration {
    public static void main(String[] args) {
        int n = 1;
        while(n < 11){
            System.out.println("Tick" + n++);
        }
    }
}


class MiddleNumber{
    public static void main(String[] args) {
        int i = 3;
        int j = 5656;        // найти середину между i и j
        while (++i < --j) ; // цикл без тела
        System.out.println("Middle: " + i);
    }
}

class Infinity{
    public static void main(String[] args) {
        int i = 0;
        while(true){
            System.out.println("Number of iteration " + i++);
        }
    }
}
