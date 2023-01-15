package org.example.examClouds.Lesson22.serialization;

import org.example.exersices.Slack.ExerciseInterface.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))){

            Person[] persons = (Person[]) ois.readObject();
            System.out.println(Arrays.toString(persons));


        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
