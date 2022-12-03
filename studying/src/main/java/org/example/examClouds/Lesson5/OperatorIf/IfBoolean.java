package org.example.examClouds.Lesson5.OperatorIf;

import org.example.exceptions.throwableExceptions.ScannerException;
import org.example.sockets.SimpleChatClientA;

import java.util.Scanner;

public class IfBoolean {
    private static boolean booleanExpression;

    public static void main(String[] args) {
        if (true) { //booleanExpression
            System.out.println("In the if block");
        }
    }
}

class IfElseWithSeasons {
    public static void main(String[] args) {
        int month = 8; // April
        String season;
        if (month == 12 || month == 1 || month == 2) {
            season = "Winter";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "Spring";
        } else if (month == 6 || month == 7 || month == 8) {
            season = "Summer";
        } else if (month == 9 || month == 10 || month == 11) {
            season = "Autumn";
        } else {
            season = "Not a Month";
        }
        System.out.println("April is in the " + season + ".");
    }
}


class IfCheckNumberWithParseToInt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        String userInput = scanner.nextLine();
        int number = Integer.parseInt(userInput);

        if (number % 2 == 0) {
            System.out.println("Number is even ");
        } else {
            System.out.println("Number is not even");
        }
    }
}

class IfFromNumberToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            compareNumber(number);
        } else {
            System.out.println("Inputted value is incorrect");
        }
    }

    public static void compareNumber(int number) {
        if (number > 0 && number < 10) {
            System.out.println("Number is less");
        } else {
            System.out.println("Number is greater or negative");
        }
    }
}
