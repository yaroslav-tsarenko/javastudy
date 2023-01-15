package org.example.examClouds.Lesson22.serialization;

import java.io.*;

public class WriteObject {

    public static void main(String[] args) {

        Person person1 = new Person(1, "Bob");
        Person person2 = new Person(3, "Adam");

        Person[] persons = {new Person(2, "Mike"), new Person(3, "Tom")};


        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))) {
            oos.writeObject(persons);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
