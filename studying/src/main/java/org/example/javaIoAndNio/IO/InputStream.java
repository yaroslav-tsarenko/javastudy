package org.example.javaIoAndNio.IO;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {
    public static void main(String[] args) {
        try{

            FileInputStream fin = new FileInputStream("D:/javaRush/file.txt");

            System.out.printf("File size: %d bytes \n", fin.available());
            int i = -1;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
        } catch(IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
