package org.example.examClouds.Lesson20.homework;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileCopyPaster3 {

    private static final String FILE_NAME = "D:\\Projects\\studying\\studying\\src\\main\\resources\\source.txt";
    private static final String OUTPUT_FILE_NAME = "D:\\Projects\\studying\\studying\\src\\main\\resources\\destination.txt";

    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader(FILE_NAME, StandardCharsets.UTF_8);
             FileWriter fileWriter = new FileWriter(OUTPUT_FILE_NAME, StandardCharsets.UTF_8, true)) {
            int read = 0;
            while ((read = fileReader.read()) != -1) {
                fileWriter.write(String.valueOf((char) read));
            }
        } catch (Exception ex) {
            System.err.println("Error");
        }
    }
}
