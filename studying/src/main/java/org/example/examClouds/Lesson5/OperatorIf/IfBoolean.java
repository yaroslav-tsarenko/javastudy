package org.example.examClouds.Lesson5.OperatorIf;

public class IfBoolean {
    private static boolean booleanExpression;

    public static void main(String[] args) {
        if (true) { //booleanExpression
            System.out.println("In the if block");
        }
    }
}

class IfElseWithSeasons{
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
