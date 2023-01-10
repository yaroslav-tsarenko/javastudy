package org.example.examClouds.Lesson20.fileWriterFileReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter buff = new BufferedWriter(new FileWriter("studying\\hello.txt"));
        String s = "Hello Java";
        for (int i = 0; i < 5; i++) {
            System.out.println(" ");
            buff.write(s);
        }
        buff.close();
    }
}
