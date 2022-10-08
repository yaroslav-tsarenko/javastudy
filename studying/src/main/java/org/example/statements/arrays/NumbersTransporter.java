package org.example.statements.arrays;

public class NumbersTransporter {
    public static void main(String[] args) {

        int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};

        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
           /*Зрівнюємо елементи попарно,
           якщо вони мають невірний порядок, то міняємо місцями*/
                if (numbers[j] > numbers[j + 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }

    }
}
