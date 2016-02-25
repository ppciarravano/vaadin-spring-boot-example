package com.larmor.vaadinspringboot;

import org.springframework.stereotype.Component;

@Component
public class MyService {

    private int count = 0;

    public String sayHello() {
        return "It works! (" + count++ + ")";
    }
}
