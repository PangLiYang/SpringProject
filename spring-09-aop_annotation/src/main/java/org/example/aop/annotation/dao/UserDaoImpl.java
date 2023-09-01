package org.example.aop.annotation.dao;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao{
    @Override
    public void addUser() {
        System.out.println("添加用戶");
    }

    @Override
    public void selectUser() {
        System.out.println("查詢用戶");
    }

    @Override
    public void selectUserById(int id) {
        System.out.println("查詢用戶 ID:" + id);
    }

    @Override
    public int updateUser() {
        System.out.println("修改用戶");
        return 123;
    }

    @Override
    public void deleteUser() {
        System.out.println("刪除用戶");
    }
}
