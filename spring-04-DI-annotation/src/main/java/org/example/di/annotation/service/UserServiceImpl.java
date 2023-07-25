package org.example.di.annotation.service;

import jakarta.annotation.Resource;
import jakarta.inject.Inject;
import org.example.di.annotation.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService{

//    @Autowired
//    @Qualifier("userDao")

//    @Inject

    @Resource
    private UserDao userDao;

    @Override
    public void addUser() {
        userDao.addUser();
    }
}
