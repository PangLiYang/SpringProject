package org.example.di.annotation.service;

import org.example.di.annotation.dao.UserDao;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService{
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser() {
        userDao.addUser();
    }

//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }
}
