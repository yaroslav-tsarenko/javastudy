package org.example.generics.introduction;

import java.util.Objects;

public class User3 {
    private static String login, password;

    public static class  Query{
        public void printToLog(){
            System.out.printf("User with login %s and password %s sent query\n", login, password);
        }
    }

public static void initialize(String login, String password){
        User3.login = login;
        User3.password = password;
}

    public static void main(String[] args) {
        initialize("login1", "password1");
        User3.Query query1= new User3.Query();
        query1.printToLog();
    }

}
