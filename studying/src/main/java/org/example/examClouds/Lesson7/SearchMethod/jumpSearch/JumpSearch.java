package org.example.examClouds.Lesson7.SearchMethod.jumpSearch;

public class JumpSearch {
    public static void main(String[] args) {
        int[] array = {2, 10, 30, 35, 20, 15, 31};
        System.out.println(jumpSearch(array, 30));
    }
    public static int jumpSearch(int[] array, int elementToSearch) {
        int arrayLength = array.length;
        int jumpStep = (int) Math.sqrt(array.length);
        int previousStep = 0;

        while (array[Math.min(jumpStep, arrayLength) - 1] < elementToSearch) {
            previousStep = jumpStep;
            jumpStep += (int) (Math.sqrt(arrayLength));
            if (previousStep >= arrayLength) {
                return -1;
            }
        }
        while (array[previousStep] < elementToSearch) {
            previousStep++;
            if (previousStep == Math.min(jumpStep, arrayLength)) {
                return -1;
            }
        }

        if (array[previousStep] == elementToSearch) {
            return previousStep;
        }
        return -1;
    }
}
