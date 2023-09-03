package org.example.tx.dao;

import jakarta.annotation.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("logDaoImpl")
public class LogDaoImpl implements LogDao{

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addLog(String msg) {
        String sql = "Insert into spring_log(msg) values (?)";
        jdbcTemplate.update(sql, msg);
    }
}
