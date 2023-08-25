package ru.ivaneskins.spring.security.dao;

import ru.ivaneskins.spring.security.entities.User;

public interface UserDao {

    User getUserById(int id);

    User getUserByName(String name);


}
