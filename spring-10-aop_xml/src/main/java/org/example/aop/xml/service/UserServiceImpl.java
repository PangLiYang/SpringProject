package org.example.aop.xml.service;

import jakarta.annotation.Resource;
import org.example.aop.xml.dao.UserDao;
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

    @Override
    public void selectUser() {
        userDao.selectUser();
    }

    @Override
    public void selectUserById(int id) throws Exception {
        userDao.selectUserById(id);
        throw new Exception();
    }

    @Override
    public int updateUser() {
        return userDao.updateUser();
    }

    @Override
    public void deleteUser() {
        userDao.deleteUser();
    }
}
