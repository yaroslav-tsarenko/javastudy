package org.example.examClouds.Lesson20.tryWithResources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExampleWithFinally {
    public static void main(String[] args) throws IOException {
        readFirstLineFromFileWithFinallyBlock("a.txt");
    }

    public static String readFirstLineFromFileWithFinallyBlock(String path)
            throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine();
        } finally {
            if (br != null) {
                br.close();
            }
        }
    }
}
