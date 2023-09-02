package org.example.problems.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class StudentAspect {

    @After("execution(* *..StudentImpl.study())")
    public void gain(){
        System.out.println("金榜題名");
    }

    @After("execution(* *..StudentImpl.play())")
    public void weak(){
        System.out.println("渾身無力");
    }
}
