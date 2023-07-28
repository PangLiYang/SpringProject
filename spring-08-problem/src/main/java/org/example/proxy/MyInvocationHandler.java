package org.example.proxy;

import org.example.service.UserServiceImpl;
import org.example.util.MyLog;
import org.example.util.MyTransaction;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // Log Pattern
        MyLog.doLog(UserServiceImpl.class);

        // Business Pattern
        Object invoke = method.invoke(target, args); // Run addUser() method

        // TX Pattern
        MyTransaction.doTX(UserServiceImpl.class);

        return invoke;
    }
}
