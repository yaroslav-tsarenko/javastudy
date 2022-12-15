package org.example.examClouds.Lesson11.serialization.DeserializationAndInheritance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeInsect {
    private static final String FILE_NAME = "testSer.ser";

    public static void main(String[] args) {
        Bug bug = new Bug("Fly", true);
        System.out.println("Before serialization " + bug);
        try (FileOutputStream fs = new FileOutputStream(FILE_NAME);
             ObjectOutputStream os = new ObjectOutputStream(fs)) {
            os.writeObject(bug);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (FileInputStream fis = new FileInputStream(FILE_NAME);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            bug = (Bug) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("After serialization " + bug);
    }
}
