package org.example.httpProtocol.repository;

import org.example.httpProtocol.model.Contact;
import org.example.httpProtocol.model.User;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class UserContactRepository {

    private final Set<Contact> contacts = new HashSet<>();

    public Contact save(Contact contact) {
        long id = generateId();
        contact.setId(id);
        contacts.add(contact);
        return contact;
    }

    public Contact update(Contact contact) {
        Optional<Contact> checkedContact = contacts.stream()
                .filter(currentContact -> currentContact.getId().equals(contact.getId())).findFirst();
        if (checkedContact.isPresent()) {
            contacts.remove(checkedContact.get());
            contacts.add(contact);
            return contact;
        } else {
            return save(contact);
        }
    }

    public void delete(Long id) {
        Optional<Contact> checkedContact = contacts.stream()
                .filter(currentContact -> currentContact.getId().equals(id)).findFirst();
        if (checkedContact.isPresent()) {
            contacts.remove(checkedContact.get());
        }
    }

    private long generateId() {
        long id = 1;
        Optional<Contact> max = contacts.stream().max(Comparator.comparing(Contact::getId));
        if (max.isPresent()) {
            id = max.get().getId() + 1;
        }
        return id;
    }

    public Set<Contact> findAll() {
        return contacts;
    }
}
