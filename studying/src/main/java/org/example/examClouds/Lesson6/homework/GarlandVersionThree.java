package org.example.examClouds.Lesson6.homework;

import java.util.Scanner;

public class GarlandVersionThree {

    public static void main(String[] args) {
        org.example.examClouds.Lesson5.homework.GarlandVersionTwo garlandVersionTwo = new org.example.examClouds.Lesson5.homework.GarlandVersionTwo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number from 1 to 4, " +
                "method 1 - blink, method 2 - check first lamp, method 3 - run line, " +
                "method 4 - state of the garland");
        int userInput = scanner.nextInt();
        switch (userInput) {
            case 1:
                garlandVersionTwo.blink();
                break;
            case 2:
                garlandVersionTwo.isLampOn();
                break;
            case 3:
                garlandVersionTwo.run();
                break;
            case 4:
                garlandVersionTwo.stateOfTheGarland();
                break;
        }
    }

    public void blink() {
        for (int j = 0; j < 1; j++) {
            int[] garland = new int[32];
            Integer.toBinaryString(garland.length);
            for (int i = 0; i < garland.length; i++) {
                System.out.println("lamp blinked");
            }
        }
    }


    public void run() {
        String [] lamps = new String[32];
        for (int i = 0; i < lamps.length; i++) {
            System.out.println(i + " lamp blinking");
        }

        String[] destinationLamps = new String[10];
        System.arraycopy(lamps, 10, destinationLamps, 0, 10);

        for (int i = 0; i < destinationLamps.length; i++) {
            System.out.println(destinationLamps[i] + " ");
        }

    }

    public void isLampOn() {
        String s = "lamp blinked";
        String d = "lamp off";
        if (s.equals("lamp blinked")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public void stateOfTheGarland(){
        System.out.println("lamps on");
    }
}



