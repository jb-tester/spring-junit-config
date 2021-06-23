package com.mytests.spring.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * *******************************
 * <p>Created by irina on 07.05.2020.</p>
 * <p>Project: spring-junit-config</p>
 * *******************************
 */
@Configuration
public class Config0 {

    @Bean
    public Bean1 bean1() {
        return new Bean1("b1");
    }
}
