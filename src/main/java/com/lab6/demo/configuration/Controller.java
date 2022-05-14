package com.lab6.demo.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller {
    private final Singleton singleton;
    @Autowired
    public Controller(Singleton singleton) {
        this.singleton = singleton;
    }
}
