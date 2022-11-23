package org.example.javaIoAndNio.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFile {

    public static void main(String[] args) {

        try{

            Path sourcePath = Paths.get("input.txt"), destinationPath = Paths.get("output.txt");
            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);

        }catch (IOException exception){
            System.err.println("Input / Output exception");
        }
    }
}
