package org.example.examClouds.Lesson20.fileWriterFileReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TreeAnswer {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String text;
        System.out.println("Many hands ony leg, what is that?");
        while (!((text = buff.readLine()).equals("stop") || text.equals("Tree"))) {
            System.out.println("Many hands ony leg, what is that?");
        }
        buff.close();
    }
}
