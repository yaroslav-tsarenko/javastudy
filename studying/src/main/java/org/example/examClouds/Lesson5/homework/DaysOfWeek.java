package org.example.examClouds.Lesson5.homework;

import org.example.examClouds.Lesson5.OperatorSystemExit.SystemExit;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        DaysOfWeek daysOfWeek = new DaysOfWeek();
        String userChoiceYes = "yes";
        String userChoiceNo = "no";
        while (userChoiceNo.equals("yes")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number of week day: ");
            int userInput = scanner.nextInt();
            daysOfWeek.week(userInput);
            System.out.println("Do you want to continue?" +
                    " Type 'yes' or type 'no'");
            userChoiceNo = scanner.next();
        }
        if (userChoiceNo.equals("no")){
            System.err.println("Program closed");
        }
    }

    public void week(int dayOfWeek) {
        if (dayOfWeek == 1) {
            System.out.println("Monday");
        } else if (dayOfWeek == 2) {
            System.out.println("Tuesday");
        } else if (dayOfWeek == 3) {
            System.out.println("Wednesday");
        } else if (dayOfWeek == 4) {
            System.out.println("Thursday");
        } else if (dayOfWeek == 5) {
            System.out.println("Friday");
        } else if (dayOfWeek == 6) {
            System.out.println("Saturday");
        } else if (dayOfWeek == 7) {
            System.out.println("Sunday");
        }else {
            System.err.println("User inputted wrong number");
        }
    }
}

class DaysOfWeekWithSwitch {
    public static void main(String[] args) {
        DaysOfWeek daysOfWeek = new DaysOfWeek();
        String userChoiceYes = "yes";
        String userChoiceNo = "no";
        while (userChoiceYes.equals("yes")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number of week day: ");
            int userInput = scanner.nextInt();
            daysOfWeek.week(userInput);
            System.out.println("Do you want to continue?" +
                    " Type 'yes' or type 'no'");
            userChoiceYes = scanner.next();
        }
        if (userChoiceNo.equals("no")){
            System.err.println("Program closed");
        }
    }

    public void week(int dayOfWeek) {
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.err.println("User inputted wrong number");
        }
    }
}

