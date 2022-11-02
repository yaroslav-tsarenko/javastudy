package org.example.exceptions.processingexeption;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProcessException {
    public static void main(String[] args) {
        File file = new File("2323");

        try {
            Scanner scanner = new Scanner(file);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        System.out.println("After try/catch");
    }

}

class ProcessException2 {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Processing exception in method main");
        }
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("test");
        Scanner scanner2 = new Scanner(file);
    }
}
