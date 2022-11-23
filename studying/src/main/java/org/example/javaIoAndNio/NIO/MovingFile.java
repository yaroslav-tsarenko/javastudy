package org.example.javaIoAndNio.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MovingFile {
    public static void main(String[] args) {

        try{

            Path sourcePath = Paths.get("file.txt"), destinationPath = Paths.get("src/file.txt");
            Files.move(sourcePath,destinationPath, StandardCopyOption.REPLACE_EXISTING);
           /* Files.copy(destinationPath,sourcePath);*/

        }catch (IOException exception){
            System.err.println("Input/Output error");
        }
    }
}
