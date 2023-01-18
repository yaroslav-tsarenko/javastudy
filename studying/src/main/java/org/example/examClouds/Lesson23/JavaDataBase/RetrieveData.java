package org.example.examClouds.Lesson23.JavaDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import static org.example.examClouds.Lesson23.JavaDataBase.ConnectionData.*;

public class RetrieveData {
    private static final String SELECT_QUERY = "SELECT * FROM users;";

    public static void main(String[] args) {
        try (Connection connection =
                     DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery(SELECT_QUERY);
            System.out.printf("%-20s%s%n", "id", "username");
            System.out.println("-------------------------------");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("username");
                System.out.printf("%-20d%s%n", id, name);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
