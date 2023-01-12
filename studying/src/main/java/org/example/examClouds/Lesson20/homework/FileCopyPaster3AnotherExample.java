package org.example.examClouds.Lesson20.homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyPaster3AnotherExample {

    private static final String FILE_NAME = "D:\\Projects\\studying\\studying\\src\\main\\resources\\source.txt";
    private static final String OUTPUT_FILE_NAME = "D:\\Projects\\studying\\studying\\src\\main\\resources\\destination.txt";

    public static void main(String[] args) throws IOException {
        try (FileInputStream inputStream = new FileInputStream(FILE_NAME);
             FileOutputStream outputStream = new FileOutputStream(OUTPUT_FILE_NAME)) {
            int read = 0;
            while ((read = inputStream.read()) != -1) {
                outputStream.write(read);
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
