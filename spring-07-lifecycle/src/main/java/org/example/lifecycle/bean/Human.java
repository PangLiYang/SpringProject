package org.example.lifecycle.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;


public class Human implements ApplicationContextAware, InitializingBean, DisposableBean {

    private String name;
    private ApplicationContext context;

    public Human() {
        System.out.println("2. instantiate");
    }

    public String getName() {
        return name;
    }

    @Value("James")
    public void setName(String name) {
        System.out.println("4. Setting properties");
        this.name = name;
    }

    public void init() {
        System.out.println("7. initialize");
    }

    public void selfDestroy() {
        System.out.println("11. destroy");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Using -> " + applicationContext);
        this.context = applicationContext;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("6. AfterPropertiesSet InitializingBean");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("10. Destroy by DisposableBean");

    }
}
