package org.example.examClouds.Lesson11.introductionIO;

import java.io.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException {


        File file = new File("C:\\Users\\yaros\\Desktop\\test.txt");

        FileOutputStream fileOutputStream = new FileOutputStream(file);

        String greetings = "Привет! Добро пожаловать на JavaRush - лучший сайт для тех, кто хочет стать программистом!";

        fileOutputStream.write(greetings.getBytes());

        fileOutputStream.close();
    }
}

class FileOutputWithBoolean {

    public static void main(String[] args) throws IOException {


        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\yaros\\Desktop\\test3.txt", true);

        String greetings = "Привет! Добро пожаловать на JavaRush - лучший сайт для тех, кто хочет стать программистом!\r\n";

        fileOutputStream.write(greetings.getBytes());

        fileOutputStream.close();
    }
}

class ReadFromFile{
    public static void main(String[] args) throws IOException {

        Date date = new Date();

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\yaros\\Desktop\\test3.txt");

        int i;

        while((i=fileInputStream.read()) != -1){

            System.out.print((char)i);

        }

        Date date1 = new Date();
        System.out.println();
        System.out.println("Time: " + (date1.getTime() - date.getTime()));

    }
}

class BufferedOptimization{
    public static void main(String[] args) throws IOException {

        Date date = new Date();

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\yaros3\\Desktop\\test4.txt");

        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 500);

        int i;

        while((i = bufferedInputStream.read())!= -1){

            System.out.print((char)i);
        }

        Date date1 = new Date();
        System.out.println();
        System.out.println("Time: " + (date1.getTime() - date.getTime()));

    }
}
