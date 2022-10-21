package org.example.generics.introduction;

import java.util.Objects;

public class User1 {
    private String login, password;

    public class Query{
        public void printToLog(){
            System.out.printf("User with login %s and password %s sent query\n", login, password);
        }
    }

    public User1(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void createQuery(){
        Query query = new Query();
        query.printToLog();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User1 user1 = (User1) o;
        return Objects.equals(login, user1.login) && Objects.equals(password, user1.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

    @Override
    public String toString() {
        return "User1{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args) {
        User1 user1 = new User1("login1", "password1");
        User1.Query query1=user1.new Query();
        query1.printToLog();

        User1.Query query2 = new User1("login2", "password2").new Query();
        query2.printToLog();

        user1.createQuery();
    }
}
