package org.example.examClouds.Lesson4.homework;

import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) {
        while (true) {
            Scanner scannerNumber = new Scanner(System.in);
            System.out.println("Enter whole number: ");
            int userInput = scannerNumber.nextInt();
            if (userInput % 2 == 0) {
                System.out.println("number is even");
            } else {
                System.out.println("number is not even");
            }
        }
    }
}

class SecondExercise {
    public static void main(String[] args) throws InterruptedException {
        SecondExercise secondExercise = new SecondExercise();
        secondExercise.start();
        secondExercise.minMassive();
    }

    public void minMassive() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        double[] userInput = new double[3];


       /* for (int i = 0; i < userInput.length; i++) {
            double userNumbers = scanner.nextDouble();
        }*/
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        a = Math.abs(a);
        b = Math.abs(b);
        c = Math.abs(c);

        System.out.println(a + " " + b + " " + c);

        double tmp = Math.min(a, b);
        double min = Math.min(tmp, c);

        System.out.println("Min number with module:\n" + min);

    }
}

class ThirdExercise {
    public static void main(String[] args) {
        for (int j = 0; j < 5; j++) {
            ThirdExercise thirdExercise = new ThirdExercise();
            int[] garland = new int[32];
            Integer.toBinaryString(garland.length);
            for (int i = 0; i < garland.length; i++) {
                thirdExercise.blink();



            }
            thirdExercise.run();
            thirdExercise.isLampOn();
        }
    }



    public void blink() {
        System.out.println("lamp blinked");
    }


    public void run() {
        int[] offGarland = new int[32];
        for (int i = 0; i < offGarland.length; i++) {
            System.out.println("lamp off");
        }
    }

    public void isLampOn(){
        String s = "lamp blinked";
        String d = "lamp off";
        if (s.equals("lamp blinked")){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}

class AverageNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double[] numbers = {a, b, c};
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("average is: " + sum / numbers.length);

    }
       /* double[] numbers = new double[20];
        for (double i = 0; i < numbers.length; i++) {
           double i1 = scanner.nextDouble();
            System.out.println(i1);*/
}
