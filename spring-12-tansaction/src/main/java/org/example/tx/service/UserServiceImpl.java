package org.example.tx.service;

import jakarta.annotation.Resource;
import org.example.tx.bean.User;
import org.example.tx.dao.UserDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("userServiceImpl")
public class UserServiceImpl implements UserService{

    @Resource
    private UserDao userDao;

    @Override
    public void addUser(User user) {
        userDao.addUser(user);

        // Need to be runtime exception
//        System.out.println(1/0);
    }
}
