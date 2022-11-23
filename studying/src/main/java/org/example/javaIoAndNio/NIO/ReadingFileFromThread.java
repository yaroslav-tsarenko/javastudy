package org.example.javaIoAndNio.NIO;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadingFileFromThread {
    public static void main(String[] args) {

        int content;

        try (InputStream inputStream = Files.newInputStream(Paths.get("file6.txt"))){
            do {
                content = inputStream.read();

                if(content != -1){
                    System.out.println((char) content);
                }
            }while (content != -1);
        }catch (IOException exception){
            System.err.println("Input/Output error");
        }
    }
}
