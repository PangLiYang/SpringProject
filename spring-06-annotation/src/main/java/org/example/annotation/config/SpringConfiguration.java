package org.example.annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Repository;

/*
    This is a configuration class
    Work as the previous XML config documentation
 */

@Configuration
@ComponentScan("org.example")
//@ComponentScan(basePackages = "org.example", excludeFilters = @ComponentScan.Filter(Repository.class))
@Import({MyConfiguration.class})
public class SpringConfiguration {
}
