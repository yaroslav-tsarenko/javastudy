package org.example.exceptions.throwableExceptions;

import java.io.IOException;
import java.util.Scanner;

public class ThrowableException {
    public static void main(String[] args) throws ScannerException{
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());

            if (x != 0) {
             throw new ScannerException("User had inputted something wrong");
            }
        }
    }
}
