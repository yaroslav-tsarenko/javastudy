package org.example.generics.covarianceAndContravariance;

public class HumanHello {
    public static void main(String[] args) {
        Student s1 = new Student();

    }
}
class Human{
    String name = "Bob";
}

class Student extends Human{
    String name = "Bill";
    int id = 100;
}

class Employee extends Student{

}


