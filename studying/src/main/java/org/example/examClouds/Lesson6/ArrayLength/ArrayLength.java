package org.example.examClouds.Lesson6.ArrayLength;

public class ArrayLength {
        public static void main(String[] args) {
            int[] array1 = {1, 2, 3, 4};
            int[][] array2 = {{1, 1, 1}, {2, 2, 2}};
            System.out.println("Размер массива array1 = " + array1.length);
            System.out.println("Размер массива array2 = " + array2.length);
            System.out.println("Размер 1-строки массива array2 = "
                    + array2[0].length);
        }
}

class MyArrays {
    public static void main(String[] args) {
        byte array[][] = {{1, 2, 3, 4}, {1, 2, 3}};
        System.out.println(array[1].length + " " + array.length);
    }
}


class Fork {
    public static void main(String[] args) {
        if (args.length == 1 | args[1].equals("test")) {
            System.out.println("test case");
        } else {
            System.out.println("production " + args[0]);
        }
    }
}