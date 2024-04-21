package com.javamaster.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Value("${ip_address}")
    private String ipAddress;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/game/**")
                .allowedOrigins("http://" + ipAddress + ":8081");
    }
}