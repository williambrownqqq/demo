package com.lab6.demo;

import com.lab6.demo.configuration.Singleton;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void contextLoads() {
    }

    @Test
    void getSingleton() {
        Singleton singleton1 = applicationContext.getBean(Singleton.class);
        Singleton singleton2 = applicationContext.getBean(Singleton.class);

        assertTrue(singleton1 == singleton2);
    }

}
