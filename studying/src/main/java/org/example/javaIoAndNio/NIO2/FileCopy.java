package org.example.javaIoAndNio.NIO2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCopy {
    public static void main(String[] args) {
        long currentMills = System.currentTimeMillis();
        long startMills = currentMills;

        Path sourceDirectory = Paths.get("C:/Users/IdeaProjects/testFolder/test.txt");
        Path targetDirectory = Paths.get("C:/Users/IdeaProjects/testFolder/test3.txt");

        try {
            Files.copy(sourceDirectory, targetDirectory);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        currentMills = System.currentTimeMillis();
        System.out.println("Время выполнения в миллисекундах: " + (currentMills - startMills));
    }
}
