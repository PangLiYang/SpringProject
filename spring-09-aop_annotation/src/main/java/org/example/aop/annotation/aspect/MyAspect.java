package org.example.aop.annotation.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    // method's name is arbitrary
    @Before("execution(* *..service.*.add*())")
    public void before() {
        System.out.println("==== 前置通知 ====");
    }

    @After("execution(* *..UserServiceImpl.selectUser())")
    public void after() {
        System.out.println("==== 最終通知 ====");
    }

    @AfterThrowing(value = "execution(* *..UserServiceImpl.selectUserById(int))", throwing = "e")
    public void afterThrowing(Exception e) {
        System.out.println("==== 異常通知 ==== ---> " + e);
    }

    @AfterReturning(value = "execution(* *..UserServiceImpl.updateUser())", returning = "res")
    public void afterReturning(int res) {
        System.out.println("==== 後置通知 ==== ---> " + res);
    }

    @Around("execution(* *..UserServiceImpl.deleteUser())")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("==== 環繞通知:前 ====");

        Object proceed = pjp.proceed(); // After run the method

        System.out.println("==== 環繞通知:後 ====");
        return proceed;
    }

}
