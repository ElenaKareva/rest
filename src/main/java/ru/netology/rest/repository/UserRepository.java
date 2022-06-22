package ru.netology.rest.repository;

import org.springframework.stereotype.Repository;
import ru.netology.rest.enums.Authorities;
import ru.netology.rest.user.User;

import java.util.*;

@Repository
public class UserRepository {

    List<User> userRepository = new ArrayList<>();

    {
        userRepository.add(new User("Elena", "111444"));
        userRepository.add(new User("Andrey", "222666"));
    }

    public List<Authorities> getUserAuthorities(String login, String password) {
        for (User user : userRepository) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return Arrays.asList(Authorities.values());
            }
        }
        return new ArrayList<>();
    }
}