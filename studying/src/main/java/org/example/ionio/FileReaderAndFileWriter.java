package org.example.ionio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndFileWriter {
    public static void main(String[] args) {
        String fileName = "D:/JavaRush/Example.txt";

// Создание объекта FileWriter
        try (FileWriter writer = new FileWriter(fileName)) {

            // Запись содержимого в файл
            writer.write("Это простой пример,\n в котором мы осуществляем\n с помощью языка Java\n запись в файл\n и чтение из файла\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

// Создание объекта FileReader
        try (FileReader fr = new FileReader(fileName)) {
            char[] a = new char[200];// Количество символов, которое будем считывать
            fr.read(a);   // Чтение содержимого в массив
            for (char c : a) {
                System.out.print(c); // Вывод символов один за другими
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
