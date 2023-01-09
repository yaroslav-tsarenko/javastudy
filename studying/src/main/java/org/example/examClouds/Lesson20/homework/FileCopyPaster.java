package org.example.examClouds.Lesson20.homework;

import org.example.examClouds.Lesson11.interfaceIntroduction.internalInterface.B;
import org.example.exersices.Slack.ExerciseInterface.File;

import java.io.*;

public class FileCopyPaster {
    public static void main(String[] args) {
        File source =
                (File) new java.io.File("studying/src/main/java/org/example/examClouds/Lesson20/homework/source.avi");
        File destination =
                (File) new java.io.File("studying/src/main/java/org/example/examClouds/Lesson20/homework/destination.avi");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("notes.txt"))) {
            String text = "Hello world!";
            bufferedWriter.write(text);
        } catch (IOException ex) {
            System.err.println("Error");
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("notes2.txt"))) {
            String text = "Hi!";
            bufferedWriter.write(text);
        } catch (IOException ex) {
            System.err.println("Error");
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("notes.txt"))) {
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                System.out.println(s);
            }

        } catch (IOException ex) {
            System.err.println("Error");
        }

        try {
            copyFileUsingStream(source, destination);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void copyFileUsingStream(File source, File destination) throws IOException {
        InputStream is = null;
        OutputStream ot = null;
        try {
            is = new FileInputStream(String.valueOf(source));
            ot = new FileOutputStream(String.valueOf(destination));
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                ot.write(buffer, 0, length);
            }

        } finally {
            is.close();
            ot.close();
        }
    }
}

