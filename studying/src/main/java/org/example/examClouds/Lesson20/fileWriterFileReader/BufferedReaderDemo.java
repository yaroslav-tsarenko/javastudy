package org.example.examClouds.Lesson20.fileWriterFileReader;

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new FileReader("studying\\hello.txt"));
        String c;
        while ((c = buff.readLine()) != null) {
            System.out.println(c);
        }
        buff.close();
    }
}
