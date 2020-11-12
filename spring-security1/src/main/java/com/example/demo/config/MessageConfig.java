package com.example.demo.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class MessageConfig {

    @Bean
    public MessageSource messageSource(){
        var source = new ReloadableResourceBundleMessageSource();
        source.addBasenames("classpath:org/springframework/security/messages");
        return source;
    }
}


