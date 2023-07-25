package org.example.annotation.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("userDao2")
//@Primary
public class UserDaoImplSub implements UserDao {
    @Override
    public void addUser() {
        System.out.println("add user to the secondDB!");
    }
}
