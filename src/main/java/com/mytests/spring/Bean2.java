package com.mytests.spring;

/**
 * *
 * <p>Created by irina on 13.07.2020.</p>
 * <p>Project: spring-junit-config</p>
 * *
 */
public class Bean2 {
    public String getId() {
        return id;
    }

    private final String id;

    public Bean2(String s) {
        this.id = s;
    }
}
