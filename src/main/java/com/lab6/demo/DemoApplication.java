package com.lab6.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {
//    @Autowired
//    private ApplicationContext applicationContext;

    public static void main(String[] args) {
        final var run = SpringApplication.run(DemoApplication.class, args);
        System.out.println("123");
    }

}
