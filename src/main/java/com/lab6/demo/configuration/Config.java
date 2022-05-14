package com.lab6.demo.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
    @Value("${singleton.name}")
    private String name;

    @Bean
    @Scope("singleton")
    public Singleton singleton(MAtrix matrix) {

        return new Singleton(name, matrix);
    }

    @Bean
    @Scope("prototype")
    public MAtrix matrix() {
        return new MAtrix();
    }
}
