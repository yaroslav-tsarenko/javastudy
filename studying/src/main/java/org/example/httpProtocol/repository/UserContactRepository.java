package org.example.httpProtocol.repository;

import org.example.httpProtocol.datasource.Datasource;
import org.example.httpProtocol.model.Contact;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class UserContactRepository {

    private final Set<Contact> contacts = new HashSet<>();
    private final Datasource datasource;

    public UserContactRepository(Datasource datasource) {
        this.datasource = datasource;
    }

    public Contact save(Contact contact) {
        datasource.execute("INSERT INTO app_contact (phone_number, email, id) " +
                "VALUES ('" + contact.getPhoneNumber() + "', '" + contact.getEmail() + "', '" + contact.getId() + "');");

        return contact;
    }

    public Contact update(Contact contact) {
        datasource.execute("UPDATE app_user SET phone_number = '" + contact.getPhoneNumber() + "', "
                + "email = '" + contact.getEmail() + "', " + "' WHERE id = " + contact.getId() + ";");
        return contact;
    }

    public void delete(Long id) {
        datasource.execute("DELETE FROM app_contact WHERE id = " + id + ";");
    }


    public Set<Contact> findAll() {
        Set<Contact> contacts = new HashSet<>();
        try (ResultSet resultSet = datasource.fetchAll("app_contact")) {
            while (resultSet.next()) {
               Contact contact = new Contact();
                Object id = resultSet.getObject("id");
                Object phoneNumber = resultSet.getObject("phone_number");
                Object email = resultSet.getObject("email");
                contact.setId((Long) id);
                contact.setEmail((String) email);
                contact.setPhoneNumber((String) phoneNumber);
               contacts.add(contact);
            }
            datasource.closeConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return contacts;
    }
}
