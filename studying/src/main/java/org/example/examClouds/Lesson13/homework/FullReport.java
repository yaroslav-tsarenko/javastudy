package org.example.examClouds.Lesson13.homework;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Month;

public class FullReport {
    public static void main(String[] args) {

        LocalDate dateOfSalaryKarpenko = LocalDate.of(2023, Month.APRIL, 1);
        LocalDate dateOfSalaryTsarenko = LocalDate.of(2023, Month.JANUARY, 23);
        LocalDate dateOfSalaryPetrichenko = LocalDate.of(2023, Month.FEBRUARY, 15);

        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Karpenko", 3000f, dateOfSalaryKarpenko);
        employees[1] = new Employee("Tsarenko", 5000f, dateOfSalaryTsarenko);
        employees[2] = new Employee("Petrichenko", 1500f, dateOfSalaryPetrichenko);
        try {
            generateReport(employees);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void generateReport(Employee[] employees) throws IOException {
        for (int i = 0; i < employees.length; i++) {
            String s = String.valueOf(employees[i]);
            System.out.println(s);
            try(PrintWriter printWriter = new PrintWriter("fullReport.txt")) {
                printWriter.write(s);
            }
        }
    }


    public static void date1() {
        LocalDate localDate = LocalDate.of(2023, Month.APRIL, 15);
    }

    public static void date2() {
        LocalDate localDate = LocalDate.of(2022, Month.DECEMBER, 27);
    }

    public static void date3() {
        LocalDate localDate = LocalDate.of(2023, Month.FEBRUARY, 15);
    }

}
