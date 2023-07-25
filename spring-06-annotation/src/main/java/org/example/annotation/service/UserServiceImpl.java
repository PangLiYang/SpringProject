package org.example.annotation.service;

import jakarta.annotation.Resource;
import jdk.jfr.Name;
import org.example.annotation.dao.UserDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service("userService")
@PropertySource("application.properties")
public class UserServiceImpl implements UserService {

    @Resource
    @Qualifier("userDao2")
    private UserDao userDao;

    @Value("${key}")
    private String key;

    @Value("000123")
    private int code;

    @Override
    public void addUser() {
        userDao.addUser();
//        System.out.println(key);
//        System.out.println(code);
    }
}
