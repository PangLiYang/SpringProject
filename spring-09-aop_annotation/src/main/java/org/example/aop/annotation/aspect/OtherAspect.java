package org.example.aop.annotation.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class OtherAspect {

    // Use Pointcut annotation to address same (redundant) execution syntax
    @Pointcut("execution(* *..service.*.*())")
    public void pointcut() {
    }

    // method's name is arbitrary
    @Before("pointcut()")
    public void before() {
        System.out.println("**共有前置通知");
    }

    @After("pointcut()")
    public void after() {
        System.out.println("**共有最終通知");
    }

}
