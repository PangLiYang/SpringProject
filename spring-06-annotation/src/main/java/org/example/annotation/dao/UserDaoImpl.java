package org.example.annotation.dao;

import org.springframework.stereotype.Repository;

@Repository("userDao1")
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println("add user to my db!");
    }
}
