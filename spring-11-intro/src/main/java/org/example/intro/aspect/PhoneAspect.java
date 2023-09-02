package org.example.intro.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.example.intro.wrapper.PhoneWrapper;
import org.example.intro.wrapper.Wrapper;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PhoneAspect {
    @DeclareParents(value = "org.example.intro.phone.Phone+", defaultImpl = PhoneWrapper.class)
    private Wrapper wrapper;
}
