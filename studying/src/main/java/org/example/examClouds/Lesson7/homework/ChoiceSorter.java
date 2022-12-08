package org.example.examClouds.Lesson7.homework;

import java.awt.*;
import java.sql.Time;
import java.util.Scanner;

public class ChoiceSorter {

    public static void main(String[] args) throws RuntimeException, InterruptedException {
        String userContinueInput = "yes";
        String userExitInput = "no";
        ChoiceSorter run = new ChoiceSorter();
        while (userContinueInput.equals("yes")){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter array of numbers: ");
            int[] arrayNumbers = new int[10];
            for (int i = 0; i < arrayNumbers.length; i++) {
                i = scanner.nextInt();
            }

            Scanner userInput = new Scanner(System.in);
            System.out.println("Enter variant how you want to sort array, " +
                    "1 - bubble sort, 2 - selection sort");
            int userChoice = userInput.nextInt();

            switch (userChoice){
                case 1:
                    run.bubbleSort(arrayNumbers);
                    break;
                case 2:
                    run.selectionSort(arrayNumbers);
                    break;
                default:
                    System.err.println("You entered wrong number");
                    break;
            }
            Thread.sleep(1500);
            System.out.println();
            Scanner scannerChoice = new Scanner(System.in);
            System.out.println("Do you want continue? " +
                    "type 'yes' to continue, type 'no' to exit");
            userContinueInput = scannerChoice.next();
        }
    }

    public void bubbleSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
            System.out.print(i + " ");
        }
    }

    public void selectionSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
            System.out.print(pos + " ");
        }
    }
}
