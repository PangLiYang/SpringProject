package org.example.intro;

import org.example.intro.config.SpringConfiguration;
import org.example.intro.phone.Phone;
import org.example.intro.wrapper.Wrapper;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IntroTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Wrapper iphone = (Wrapper) context.getBean("Iphone");
//        iphone.call();
        iphone.wrapThing();

    }
}
