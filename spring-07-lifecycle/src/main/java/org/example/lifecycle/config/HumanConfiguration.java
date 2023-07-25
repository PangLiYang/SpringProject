package org.example.lifecycle.config;

import org.example.lifecycle.bean.Human;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class HumanConfiguration {

    @Bean(name = "human", initMethod = "init", destroyMethod = "destroy")
    public Human humanInstance() {
        return new Human();
    }
}
