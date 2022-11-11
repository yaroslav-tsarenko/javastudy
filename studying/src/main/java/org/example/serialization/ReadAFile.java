package org.example.serialization;

import java.io.*;

public class ReadAFile {
    public static void main(String[] args) {
        try{
            File myFile = new File("MyText.txt");
            FileReader fileReader = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }reader.close();
        }catch (FileNotFoundException ex) {
            System.err.println("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
