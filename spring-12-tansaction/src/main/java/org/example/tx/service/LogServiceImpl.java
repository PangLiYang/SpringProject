package org.example.tx.service;

import jakarta.annotation.Resource;
import org.example.tx.dao.LogDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("logServiceImpl")
public class LogServiceImpl implements LogService{

    @Resource
    private LogDao logDao;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Override
    public void addLog(String msg) {
        logDao.addLog(msg);
    }
}
