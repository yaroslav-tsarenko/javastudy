package org.example.javaIoAndNio.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class OutputStream2 {
    public static void main(String[] args) {
        FileWriter fr = null;
        String str = " Java";

        try {
            fr = new FileWriter("D:/1.txt", true);
            fr.write(str);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
