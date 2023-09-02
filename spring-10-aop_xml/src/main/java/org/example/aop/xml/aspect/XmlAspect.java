package org.example.aop.xml.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class XmlAspect {

    public void before() {
        System.out.println("==== 前置通知 ====");
    }

    public void after() {
        System.out.println("==== 最終通知 ====");
    }

    public void afterThrowing(Exception e) {
        System.out.println("==== 異常通知 ==== ---> " + e);
    }

    public void afterReturning(int res) {
        System.out.println("==== 後置通知 ==== ---> " + res);
    }

    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("==== 環繞通知:前 ====");

        Object proceed = pjp.proceed(); // After run the method

        System.out.println("==== 環繞通知:後 ====");
        return proceed;
    }

}
