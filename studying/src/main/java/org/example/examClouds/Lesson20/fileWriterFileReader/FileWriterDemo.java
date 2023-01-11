package org.example.examClouds.Lesson20.fileWriterFileReader;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("studying\\hello.txt");
        String text = "Hello world!";
        writer.write(text);
        writer.close();
    }
}
