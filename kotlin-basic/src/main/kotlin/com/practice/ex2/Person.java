package com.practice.ex2;

import org.springframework.lang.Nullable;

public class Person {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    @Nullable
    public String getName() {
        return name;
    }
}
