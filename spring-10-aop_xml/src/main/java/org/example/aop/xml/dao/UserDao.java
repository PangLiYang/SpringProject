package org.example.aop.xml.dao;

public interface UserDao {
    void addUser();

    void selectUser();

    void selectUserById(int id);

    int updateUser();

    void deleteUser();
}
