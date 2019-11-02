package com.example.exception.exceptions;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

@Configuration
public class MySimpleMappingExceptionResolver {

    @Bean
    public SimpleMappingExceptionResolver gSimpleMappingExceptionResolver() {
        SimpleMappingExceptionResolver s = new SimpleMappingExceptionResolver();
        Properties props = new Properties();
        props.put("java.lang.ArithmeticException", "mathError");
        props.put("java.lang.NullPointerException", "nullPointerError");
        s.setExceptionMappings(props);
        return s;
    }
}