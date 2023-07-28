package org.example.service;

import jakarta.annotation.Resource;
import org.example.dao.UserDao;
import org.example.util.MyLog;
import org.example.util.MyTransaction;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    @Qualifier("userDao")
    private UserDao userDao;

    @Override
    public void addUser() {
        userDao.addUser();
    }
}
