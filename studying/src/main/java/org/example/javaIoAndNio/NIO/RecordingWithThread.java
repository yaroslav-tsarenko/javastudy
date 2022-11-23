package org.example.javaIoAndNio.NIO;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RecordingWithThread {

    public static void main(String[] args) {
        String text = "Hello World";
        byte[] bytes = text.getBytes();

        try(OutputStream outputStream = new BufferedOutputStream(Files.newOutputStream(Paths.get("file5.txt")))){
            for(byte eachByte : bytes){
                outputStream.write(eachByte);
            }
        }catch (IOException exception){
            System.err.println("Input/Output error");
        }
    }
}
