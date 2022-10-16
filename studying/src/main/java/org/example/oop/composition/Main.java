package org.example.oop.composition;

public class Main {
    public static void main(String[] args) {
        Role role = new Role();
        role.setDescription("Administrator");
        role.setTitle("ADMIN");

        User user = new User();
        user.setEmail("4554545445.com");
        user.setLogin("uLogin");
        user.setPassword("12345678910");
        user.setRole(role);
    }
}
