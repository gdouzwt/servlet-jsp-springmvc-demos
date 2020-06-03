package io.zwt.spring.app23a.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class MessageConfig {

    @Bean
    ReloadableResourceBundleMessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource =
            new ReloadableResourceBundleMessageSource();
        messageSource.setBasenames("/WEB-INF/resource/messages", "/WEB-INF/resource/labels");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }
}
