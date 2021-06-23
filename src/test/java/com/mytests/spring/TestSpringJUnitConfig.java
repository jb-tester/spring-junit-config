package com.mytests.spring;

import com.mytests.spring.configs.Bean1;
import com.mytests.spring.configs.Config0;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * *******************************
 * <p>Created by irina on 07.05.2020.</p>
 * <p>Project: spring-junit-config</p>
 * *******************************
 */
@SpringJUnitConfig(classes = Config0.class)
public class TestSpringJUnitConfig {

    @Autowired
    private Bean1 bean1; // https://youtrack.jetbrains.com/issue/IDEA-166549

    @Test
    public void testBean1Exists() {
      assertNotNull(bean1);  
    }
    @Test
    public void testBean1Id() {
        
      assertEquals(bean1.getId(), "b1");
    }
}
