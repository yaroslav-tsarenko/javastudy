package org.example.examClouds.Lesson20.fileWriterFileReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter buff = new BufferedWriter(new FileWriter("studying\\hello.txt"));
        String s = "Hello Java!";
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {
                for (int k = 0; k < 1; k++) {
                    buff.write(s);
                    buff.append("\n");
                }
            }
        }
        buff.close();
    }
}
