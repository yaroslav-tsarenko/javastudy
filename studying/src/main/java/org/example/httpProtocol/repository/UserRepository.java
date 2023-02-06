package org.example.httpProtocol.repository;

import org.example.httpProtocol.model.User;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class UserRepository {

    private final Set<User> users = new HashSet<>();

    public User save(User user) {
        long id = generateId();
        user.setId(id);
        users.add(user);

        return user;
    }

    public User update(User user) {
        Optional<User> checkedUser = users.stream()
                .filter(currentUser -> currentUser.getId().equals(user.getId())).findFirst();
        if (checkedUser.isPresent()) {
            users.remove(checkedUser.get());
            users.add(user);
            return user;
        } else {
            return save(user);
        }
    }

    private long generateId() {
        long id = 1;
        Optional<User> max = users.stream().max(Comparator.comparing(User::getId));
        if (max.isPresent()) {
            id = max.get().getId() + 1;
        }
        return id;
    }

    public Set<User> findAll() {
        return users;
    }
}
