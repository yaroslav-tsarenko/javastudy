package org.example.examClouds.Lesson20.homework;

import java.io.*;

public class FileCopyPaster2 {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("D:\\Projects\\studying\\firstFile.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\Projects\\studying\\secondFile.txt");

            while (inputStream.available() > 0) {
                int data = inputStream.read();
                fileOutputStream.write(data);
            }

            inputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
