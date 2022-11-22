package org.example.javaIoAndNio.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStream2 {
    public static void main(String[] args) {

        FileInputStream fis = null;
        InputStreamReader isr = null;

        int b = 0;

        try {

            fis = new FileInputStream("D:/1.txt");
            isr = new InputStreamReader(fis,"UTF-8");
            while ((b = isr.read()) != -1) {
                System.out.println((char)b);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
