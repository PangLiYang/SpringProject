package org.example.aop.xml.service;

public interface UserService {
    void addUser();

    void selectUser();

    void selectUserById(int id) throws Exception;

    int updateUser();

    void deleteUser();
}
