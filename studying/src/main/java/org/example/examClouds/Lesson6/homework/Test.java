package org.example.examClouds.Lesson6.homework;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.run();
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
}
