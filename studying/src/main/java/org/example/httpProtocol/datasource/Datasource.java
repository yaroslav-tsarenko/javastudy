package org.example.httpProtocol.datasource;

import java.sql.*;

public class Datasource implements AutoCloseable {
    private static final String URL = "jdbc:postgresql://localhost:5432/demo_server_db?currentSchema=demo_server_local";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "Profimaster2019201920182018";
    private Connection connection;
    private Statement statement;


    private void openConnection() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new DatasourceException("Can't establish DB connection");
        }
    }

    public void closeConnection() {
        try {
            if (!statement.isClosed()) {
                statement.close();
            }
            if (!connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new DatasourceException("Can't establish DB connection");
        }
    }

    public ResultSet fetchAll(String tableName) {
        String sql = "SELECT * FROM " + tableName + ";";
        try {
            openConnection();
            return statement.executeQuery(sql);
        } catch (SQLException e) {
            throw new DatasourceException("Can't execute query: " + sql);
        }
    }

    public void execute(String query) {
        openConnection();
        try {
            statement.execute(query);
        } catch (SQLException e) {
            throw new DatasourceException("Can't execute query: " + query);
        }
        closeConnection();
    }

    @Override
    public void close() throws Exception {
        closeConnection();
    }
}
