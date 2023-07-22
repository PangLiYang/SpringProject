package org.example.di.xml.service;

import org.example.di.xml.dao.UserDao;

public class UserServiceImpl implements UserService{
    private UserDao userDao;

//    public UserServiceImpl(UserDao userDao) {
//        this.userDao = userDao;
//    }

    @Override
    public void addUser() {
        userDao.addUser();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
