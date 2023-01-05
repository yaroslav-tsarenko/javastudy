package org.example.examClouds.Lesson19.homework;

public class LoginAndPasswordChecker {
    public static void main(String[] args) {
        signIn("45jdnfvhoglrg", "rjgnrglrgnlrg", "rjgnrglrgnlrg");

    }

    public static void signIn(String login, String password, String confirmPassword) {

        if (login.length() > 20) {
            System.err.println("WrongLoginException");
            System.exit(0);
        } else {
            System.out.println("True");
        }

        if (password.length() > 20 | password.length() != confirmPassword.length()) {
            System.err.println("WrongPasswordException");
            System.out.println("Enter your password again");
            System.exit(0);
        } else {
            System.out.println("True");
        }
    }
}
