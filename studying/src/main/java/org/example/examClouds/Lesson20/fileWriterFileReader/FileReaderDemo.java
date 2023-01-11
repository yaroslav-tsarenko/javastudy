package org.example.examClouds.Lesson20.fileWriterFileReader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("studying\\hello.txt");
        int c;
        while ((c= reader.read()) != -1){
            System.out.println((char) c);
        }
    }
}
