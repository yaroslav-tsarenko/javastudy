package org.example.examClouds.Lesson16.internalClasses;

import java.util.Objects;

public class User1 {
    private String login, password;

    public class Query{
        public void printToLog(){
            System.out.printf("User with login %s and with password %s sent query\n", login, password);
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
        if (!(o instanceof User1 user1)) return false;
        if (!Objects.equals(login, user1.login)) return false;
        return Objects.equals(password, user1.password);
    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
