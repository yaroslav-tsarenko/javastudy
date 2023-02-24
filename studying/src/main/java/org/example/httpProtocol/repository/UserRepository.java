package org.example.httpProtocol.repository;

import org.example.httpProtocol.datasource.Datasource;
import org.example.httpProtocol.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class UserRepository {

    private final Set<User> oldUsers = new HashSet<>();
    private final Datasource datasource;

    public UserRepository(Datasource datasource) {
        this.datasource = datasource;
    }

    public User save(User user) {
        datasource.execute("INSERT INTO app_user (id, name, email, phone_number) " +
                "VALUES (DEFAULT, '" + user.getName() + "', '" + user.getEmail() + "', '" + user.getPhoneNumber()
                + "');");

        return user;
    }

    public User update(User user) {
        datasource.execute("UPDATE app_user SET name = '" + user.getName() + "', " + "email = '" + user.getEmail()
                + "', " + "phone_number = '" + user.getPhoneNumber() + "' WHERE id = " + user.getId() + ";");
        return user;
    }

    public void delete(Long id) {
        datasource.execute("DELETE FROM app_user WHERE id = " + id + ";");
    }

    public Set<User> findAll() {
        Set<User> users = new HashSet<>();
        try (ResultSet resultSet = datasource.fetchAll("app_user")) {
            while (resultSet.next()) {
                User user = new User();
                Object id = resultSet.getObject("id");
                Object name = resultSet.getObject("name");
                Object email = resultSet.getObject("email");
                Object phoneNumber = resultSet.getObject("phone_number");
                user.setId((Long) id);
                user.setName((String) name);
                user.setEmail((String) email);
                user.setPhoneNumber((String) phoneNumber);
                users.add(user);
            }
            datasource.closeConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return users;
    }
}
