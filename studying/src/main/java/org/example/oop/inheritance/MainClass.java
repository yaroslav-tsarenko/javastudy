package org.example.oop.inheritance;

public class MainClass {
    public static void main(String[] args) {

        Employee[] ems = new Employee[3];
        ems[0] = new Doctor("Jack", 123,9000,4);
        ems[1] = new Lawyer("Petya", 1234, 9000000, "Criminal");
        ems[2] = new Lawyer("Oleg", 1234, 5000000, "Criminal");
        for (int i = 0; i < ems.length; i++) {
            System.out.println(ems[i]);
        }

    /*    double totalSalary = 0;
        for (int i = 0; i < ems.length; i++) {
            totalSalary += ems[i].getSalaryUah();
            System.out.println("Total salary: " + totalSalary);
        }
    }*/
    }
}
