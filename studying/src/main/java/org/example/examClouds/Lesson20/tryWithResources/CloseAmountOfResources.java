package org.example.examClouds.Lesson20.tryWithResources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CloseAmountOfResources {
    public static String readFirstLineFromFile2(String path)
            throws IOException {
        try (FileReader f = new FileReader("a.txt");
             BufferedReader br = new BufferedReader(f)) {
            return br.readLine();
        }
    }
}
