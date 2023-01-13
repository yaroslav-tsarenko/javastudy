package org.example.examClouds.Lesson22.serialization;

import java.io.*;

public class Serialization {

    public boolean serialization(Cat cat) {

        boolean flag = false;

        File file = new File("D:\\Projects\\studying\\cat.data");

        ObjectOutputStream oos = null;

        try {
            FileOutputStream fos = new FileOutputStream(file);
            if (fos != null) {
                oos = new ObjectOutputStream(fos);
                oos.writeObject(cat);
                flag = true;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        return true;
    }

    public Cat deserialization() throws InvalidObjectException {
        File file = new File("D:\\Projects\\studying\\cat.data");
        ObjectInputStream ois = null;

        try {
            FileInputStream fis = new FileInputStream(file);
            if (fis != null){
                ois = new ObjectInputStream(fis);
                Cat cat = (Cat) ois.readObject();

                return cat;
            }
        }catch (FileNotFoundException e){
            System.err.println("Error");

        }catch (IOException e){
            System.err.println("Error IOException");

        }catch (ClassNotFoundException e){
            System.err.println("Error Class Not Found");
        }
        throw new InvalidObjectException("Object fail");
    }
}
