package org.example.examClouds.Lesson22.homework.serializeFile;

import java.io.*;
import java.util.Arrays;

public class SerializeHorse {
    public static void main(String[] args) {

        Horse[] horses = {new Horse("Mustang", "Pegasus"),
                new Horse("Alpha", "Beta"),  new Horse("Gamma", "Etta")};

        serializeMethod(horses);
        deserializeMethod(horses);
    }

    public static void serializeMethod(Object[] o){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("breedsOfHorses.txt"))) {
            oos.writeObject(o);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deserializeMethod(Object[] o){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("breedsOfHorses.txt"))) {
            Horse[] horses = (Horse[]) ois.readObject();
            System.out.println(Arrays.toString(horses));
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
