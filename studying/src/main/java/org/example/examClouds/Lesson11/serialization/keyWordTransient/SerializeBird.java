package org.example.examClouds.Lesson11.serialization.keyWordTransient;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeBird {

    private static final String FILE_NAME = "testSer.ser";

    public static void main(String[] args) {
        Ring ring = new Ring(3);
        Bird bird = new Bird("pigeon", ring);
        System.out.println("Before serialization: "
                + bird.getRing().getSize());
        try (FileOutputStream fs = new FileOutputStream(FILE_NAME);
             ObjectOutputStream os = new ObjectOutputStream(fs)) {
            os.writeObject(bird);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (FileInputStream fis = new FileInputStream("testSer.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            bird = (Bird) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("After serialization: "
                + bird.getRing().getSize());
    }
}
