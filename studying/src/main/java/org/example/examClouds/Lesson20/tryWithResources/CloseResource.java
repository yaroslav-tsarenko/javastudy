package org.example.examClouds.Lesson20.tryWithResources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CloseResource {
    public static String readFirstLineFromFile(String path) throws IOException {
        try (BufferedReader br =
                     new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }
}
