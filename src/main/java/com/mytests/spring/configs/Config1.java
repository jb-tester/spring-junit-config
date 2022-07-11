package com.mytests.spring.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * *
 * <p>Created by irina on 7/11/2022.</p>
 * <p>Project: spring-junit-config</p>
 * *
 */
@Configuration
public class Config1 {

    @Bean
    public Bean11 bean11() {
        return new Bean11();
    }
}
