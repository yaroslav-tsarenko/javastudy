package org.example.examClouds.Lesson5.OperatorSwitch;

import java.util.Scanner;

public class BobEatFood {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter food like: 'pizza, sushi, burger or hot-dog': ");
            String foodForBob = scanner.nextLine();
            switch (foodForBob) {
                case "pizza":
                    System.out.println("Bob eating pizza");
                    break;
                case "sushi":
                    System.out.println("Bob eating sushi");
                    break;
                case "burger":
                    System.out.println("Bob eating burger");
                    break;
                case "hot-dog":
                    System.out.println("Bob eating hot-dog");
                    break;
                default:
                    System.out.println("Bob is crying");
            }
        }
    }
}

class TrafficLight {
    public static void main(String[] args) {
        int x = 2;
        switch (x) {
            case 1:
                System.out.println("green");
                break;
            case 2:
                System.out.println("yellow");
                break;
            case 3:
                System.out.println("red");
                break;
            default:
                System.out.println("Inputted number is incorrect");
                break;
        }
    }
}


class VariablesOfCase {
    public static void main(String[] args) {
        int month = 4;
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Not a Month";
        }
        System.out.println("April is in the " + season + ".");
    }
}


class AnotherVariableOfSwitch{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of exam: ");
        String exam = scanner.nextLine();
        switch (exam) {
            case "OCPJP 7":
                System.out.print(exam + ": 1Z0-804");
                break;
            case "OCPJP 8":
                System.out.print(exam + ": 1Z0-809");
                break;
            default:
                System.out.print(exam + ": ----");
                break;
        }
    }
}
