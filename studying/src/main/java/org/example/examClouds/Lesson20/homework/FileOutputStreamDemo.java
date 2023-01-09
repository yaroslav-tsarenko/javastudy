package org.example.examClouds.Lesson20.homework;

import java.io.*;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        try {
            char[] symbols = {'a', 'b', 'c'};

            try (OutputStream output = new FileOutputStream("src/io")) {
                for (char symbol : symbols) {
                    output.write(symbol);
                }
            } catch (IOException e) {
                System.err.println("Error exception");
            }

            try (InputStream input = new FileInputStream("src/io")) {
                int size = input.available();
                for (int i = 0; i < size; i++) {
                    System.out.print((char) input.read() + " ");
                }
            }
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
