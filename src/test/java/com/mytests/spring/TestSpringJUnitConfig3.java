package com.mytests.spring;

import com.mytests.spring.configs.Bean1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringJUnitConfig(locations = {"classpath:config1.xml","classpath:config0.xml"})
public class TestSpringJUnitConfig3
{

    @Autowired
    private Bean1 bean1;

    @Autowired
    private Bean2 bean2;

    @Test
    void testBean1() {
        assertEquals(bean1.getId(),"xml-bean1");
    }
    @Test
    void testBean2() {
        assertEquals(bean2.getId(),"xml-bean2");
    }
}