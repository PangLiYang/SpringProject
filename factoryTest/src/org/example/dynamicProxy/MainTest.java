package org.example.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MainTest {
    public static void main(String[] args) {
        Target t1 = new T1();

        /*
            Enhance methods for targeted object
         */
        InvocationHandler invocationHandler = (Object proxy, Method method, Object[] arg) -> {
            System.out.println("Prepare beforehand");

            // Call eat() in object T1
            Object invoke = method.invoke(t1);

            System.out.println("Result after");
            return invoke;
        };

        // Dynamically creating proxy with JDK dynamic proxy class
        // 3 arguments -
        //   a. ClassLoader
        //   b. Class Interface
        //   c. Invocation handler

        Target proxy = (Target) Proxy.newProxyInstance(t1.getClass().getClassLoader(),
                t1.getClass().getInterfaces(), invocationHandler);

        Main main = new Main(proxy);
        main.makeTarget();
    }
}
