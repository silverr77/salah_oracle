package com.imagengine.demo;

import com.imagengine.demo.service.ImageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class ImagengineApplication implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(ImagengineApplication.class, args);

    }
    
  
    
    
    
}
