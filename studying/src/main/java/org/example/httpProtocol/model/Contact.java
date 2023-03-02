package org.example.httpProtocol.model;

import java.util.Objects;

public class Contact {
    public String phoneNumber;
    public String email;
    public Long id;


    public Contact(String phoneNumber, String email, Long id) {
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.id = id;
    }

    public Contact(){

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(phoneNumber, contact.phoneNumber) && Objects.equals(email, contact.email) && Objects.equals(id, contact.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, email, id);
    }
}
