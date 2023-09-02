package org.example.tx.dao;

import jakarta.annotation.Resource;
import org.example.tx.bean.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("userDaoImpl")
public class UserDaoImpl implements UserDao{

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addUser(User user) {
        String sql = "Insert into spring_user(name) values (?)";
        jdbcTemplate.update(sql, user.getName());

    }
}
