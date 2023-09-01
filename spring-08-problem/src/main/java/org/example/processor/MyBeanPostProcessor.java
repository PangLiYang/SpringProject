package org.example.processor;

import org.example.util.MyLog;
import org.example.util.MyTransaction;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        // Only process TX in Service implementations
        if (beanName.endsWith("Service")) {
            InvocationHandler invocationHandler = (Object p, Method method, Object[] args) -> {
                //add... update... delete...
                if (method.getName().startsWith("add")) {
                    // Logging
                    MyLog.doLog(bean.getClass());
                    // Main method
                    Object invoke = method.invoke(bean, args);
                    // TX
                    MyTransaction.doTX(bean.getClass());

                    return invoke;
                }

                return method.invoke(bean, args);
            };

            // Create proxy object
            Object obj = Proxy.newProxyInstance(bean.getClass().getClassLoader(),
                    bean.getClass().getInterfaces(),
                    invocationHandler);

            return obj;
        }

        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
