package org.example.aop.annotation.dao;

public interface UserDao {
    void addUser();

    void selectUser();

    void selectUserById(int id);

    int updateUser();

    void deleteUser();
}
