package org.example.examClouds.Lesson16.internalClasses;

public class User1Main {
    public static void main(String[] args) {
        User1 user1 = new User1("login22", "password322323");
        User1.Query query1 = user1.new Query();
        query1.printToLog();

        User1.Query query2 = new User1("login2323", "passwords358").new Query();
        query2.printToLog();

        user1.createQuery();

    }
}
