package org.example.javaIoAndNio.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
    public static void main(String[] args) {
        String text = "Hello world!"; // строка для записи
        try(FileOutputStream fos = new FileOutputStream("D:/JavaRush/file.txt")){
            // переводим нашу строку в байты
            byte[] buffer = text.getBytes();
            fos.write(buffer, 0, buffer.length);
            System.out.println("The file has been written");
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
