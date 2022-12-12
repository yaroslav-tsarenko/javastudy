package org.example.examClouds.Lesson9.getAndSet;

public class UserDemo {
    public static void main(String[] args) {
        User user = new User("myLogin", "myPassword");
        System.out.println("Login: " + user.getLogin());
        System.out.println("Password: " + user.getPassword());
    }
}
