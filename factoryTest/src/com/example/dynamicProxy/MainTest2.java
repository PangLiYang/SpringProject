package com.example.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MainTest2 {
    public static void main(String[] args) {
        Target t1 = new T1();

        /*
            What if we need arguments in some specific methods?
         */
        InvocationHandler invocationHandler = (Object proxy, Method method, Object[] arg) -> {

            Object invoke = null;
            if ("price".equals(method.getName())) {
                System.out.println("enhanced the price method!");
                method.invoke(t1, (Integer) arg[0] / 2);
//                invoke = method.invoke(t1, new Object[] {(Integer) arg[0] / 2});
            } else {
                invoke = method.invoke(t1);
            }

            return invoke;
        };

        Target proxy = (Target) Proxy.newProxyInstance(t1.getClass().getClassLoader(),
                t1.getClass().getInterfaces(), invocationHandler);

        Main main = new Main(proxy);
        main.makeTarget();
        main.setPrice(20);
    }
}
