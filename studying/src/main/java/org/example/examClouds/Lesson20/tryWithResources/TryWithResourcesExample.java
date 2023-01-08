package org.example.examClouds.Lesson20.tryWithResources;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner("out.txt");
             PrintWriter out = new PrintWriter("out.txt")) {

        } catch (IOException e) {
            System.err.println("Error");
        }
    }
}
